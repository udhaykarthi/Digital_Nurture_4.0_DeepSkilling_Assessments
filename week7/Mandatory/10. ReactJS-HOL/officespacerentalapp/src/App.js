import React from 'react';
import officeImage from './assets/office.webp'; // Replace with your actual path
import './App.css'; // We'll define .textRed and .textGreen in this CSS file

function App() {
  const element = "Office Space";
  const jsxatt = <img src={officeImage} width="25%" height="25%" alt="Office Space" />;
  
  const ItemName = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };

  // Conditional styling based on Rent
  let colors = [];
  if (ItemName.Rent <= 60000) {
    colors.push("textRed");
  } else {
    colors.push("textGreen");
  }

  return (
    <div className="App">
      <h1>{element}, at Affordable Range</h1>
      {jsxatt}
      <h1>Name: {ItemName.Name}</h1>
      <h3 className={colors.join(' ')}>Rent: Rs. {ItemName.Rent}</h3>
      <h3>Address: {ItemName.Address}</h3>
    </div>
  );
}

export default App;
