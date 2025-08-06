// src/App.js
import React from 'react';
import ListofPlayers from './ListofPlayers';
import { OddPlayers, EvenPlayers, MergedIndianPlayers } from './IndianPlayers';

function App() {
  const flag = false; 

  const IndianTeam = ["Sachin", "Dhoni", "Virat", "Jadeja", "Yuvaraj", "Rohit"];

  return (
    <div className="App">
      {flag ? (
        <ListofPlayers />
      ) : (
        <div>
          <h2>Odd Players</h2>
          <OddPlayers players={IndianTeam} />
          <hr />
          <h2>Even Players</h2>
          <EvenPlayers players={IndianTeam} />
          <hr />
          <h2>List of Indian Players Merged:</h2>
          <ul>
            {MergedIndianPlayers.map((player, index) => (
              <li key={index}>Mr. {player}</li>
            ))}
          </ul>
        </div>
      )}
    </div>
  );
}

export default App;
