import React, { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(1);

  const increment = () => {
    const newCount = count + 1;
    setCount(newCount);
    alert(`Hello Member${newCount}`);
  };

  const decrement = () => setCount(count - 1);

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = () => {
    alert("I was clicked");
  };

  return (
    <div style={{ marginBottom: "30px" }}>
      <h3>{count}</h3>
      <button onClick={increment}>Increment</button><br /><br />
      <button onClick={decrement}>Decrement</button><br /><br />
      <button onClick={() => sayWelcome("welcome")}>Say welcome</button><br /><br />
      <button onClick={handleClick}>Click on me</button>
    </div>
  );
}

export default Counter;
