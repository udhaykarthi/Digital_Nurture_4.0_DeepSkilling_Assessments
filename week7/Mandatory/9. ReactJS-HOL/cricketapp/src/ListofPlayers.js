import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: "Jack", score: 50 },
    { name: "Michael", score: 70 },
    { name: "John", score: 40 },
    { name: "Ann", score: 61 },
    { name: "Elisabeth", score: 61 },
    { name: "Sachin", score: 95 },
    { name: "Dhoni", score: 100 },
    { name: "Virat", score: 84 },
    { name: "Jadeja", score: 64 },
    { name: "Raina", score: 75 },
    { name: "Rohit", score: 80 }
  ];

  const filtered = players.filter(player => player.score <= 70);

  return (
    <div>
      <h2>List of Players</h2>
      <ul>{players.map((p, index) => (
        <li key={index}>Mr.{p.name} {p.score}</li>
      ))}
      </ul>

      <h3>List Of Players having Scores Less than 70</h3>
        <ul>
            {filtered.map((p, index) => (
            <li key={index}>Mr. {p.name} {p.score}</li>
            ))}
        </ul>
    </div>
  );
};

export default ListofPlayers;
