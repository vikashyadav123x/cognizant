import React from 'react'

export default function IndianPlayers() {
  const indianPlayers = ['Rohit Sharma', 'Shubman Gill', 'Virat Kohli', 'Suryakumar Yadav', 'Hardik Pandya', 'Ravindra Jadeja']
  const [odd1, even1, odd2, even2, odd3, even3] = indianPlayers

  const t20Players = ['KL Rahul', 'Rishabh Pant', 'Yuzvendra Chahal']
  const ranjiPlayers = ['Sarfaraz Khan', 'Cheteshwar Pujara', 'Ajinkya Rahane']
  const mergedPlayers = [...t20Players, ...ranjiPlayers]

  return (
    <section className="card">
      <h2>Indian Players</h2>

      <h3>Odd Team Players</h3>
      <p>{odd1}, {odd2}, {odd3}</p>

      <h3>Even Team Players</h3>
      <p>{even1}, {even2}, {even3}</p>

      <h3>Merged Players</h3>
      <ul>
        {mergedPlayers.map((player) => (
          <li key={player}>{player}</li>
        ))}
      </ul>
    </section>
  )
}
