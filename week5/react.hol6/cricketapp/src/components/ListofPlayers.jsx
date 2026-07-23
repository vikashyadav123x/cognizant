import React from 'react'

const players = [
  { name: 'Virat Kohli', score: 92 },
  { name: 'Rohit Sharma', score: 88 },
  { name: 'KL Rahul', score: 64 },
  { name: 'Suryakumar Yadav', score: 78 },
  { name: 'Hardik Pandya', score: 71 },
  { name: 'Shubman Gill', score: 95 },
  { name: 'Rishabh Pant', score: 69 },
  { name: 'Jasprit Bumrah', score: 83 },
  { name: 'Mohammed Shami', score: 67 },
  { name: 'Ravindra Jadeja', score: 74 },
  { name: 'Axar Patel', score: 61 },
]

export default function ListofPlayers() {
  const below70Players = players.filter((player) => player.score < 70)

  return (
    <section className="card">
      <h2>List of Players</h2>
      <div className="grid">
        {players.map((player, index) => (
          <article key={index} className="panel">
            <p>Name: {player.name}</p>
            <p>Score: {player.score}</p>
          </article>
        ))}
      </div>

      <h3>Players with scores below 70</h3>
      <ul>
        {below70Players.map((player) => (
          <li key={player.name}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </section>
  )
}
