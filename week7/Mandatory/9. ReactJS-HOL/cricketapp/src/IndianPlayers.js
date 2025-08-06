import React from 'react';

export function OddPlayers({ players }) {
  const [first, , third, , fifth] = players;
  return (
    <div>
      <ul>
        <li>First: {first}1</li>
        <li>Third: {third}3</li>
        <li>Fifth: {fifth}5</li>
      </ul>
    </div>
  );
}

export function EvenPlayers({ players }) {
  const [, second, , fourth, , sixth] = players;
  return (
    <div>
      <ul>
        <li>Second: {second}2</li>
        <li>Fourth: {fourth}4</li>
        <li>Sixth: {sixth}6</li>
      </ul>
    </div>
  );
}

const T20Players = ['First Player', 'Second Player', 'Third Player'];
const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
export const MergedIndianPlayers = [...T20Players, ...RanjiTrophyPlayers];
