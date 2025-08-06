import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency] = useState('Euro');

  const handleSubmit = (e) => {
    e.preventDefault();
    const convertedAmount = amount * 80;
    alert(`Converting to  ${currency} Amount is ${convertedAmount}`);
  };

  return (
    <div style={{ marginTop: "40px" }}>
      <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>
      <form onSubmit={handleSubmit}>
        <label>
          Amount:
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
            style={{ marginLeft: "10px", marginBottom: "10px" }}
          />
        </label><br /><br />
        <label>
          Currency:
          <input type="text" value={currency} disabled style={{ marginLeft: "10px" }} />
        </label><br /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;
