import React from 'react'

export default function CalculateScore({ Name = 'Unknown', School = 'Unknown', Total = 0, goal = 1 }) {
  const totalNum = Number(Total)
  const goalNum = Number(goal) || 1
  const average = totalNum / goalNum

  return (
    <div className="formatstyle">
      <p className="Name">Name: {Name}</p>
      <p className="School">School: {School}</p>
      <p className="Total">Total: {totalNum}</p>
      <p className="Score">Goal: {goalNum}</p>
      <p className="Score">Average Score: {Number.isFinite(average) ? average.toFixed(2) : 'N/A'}</p>
    </div>
  )
}
