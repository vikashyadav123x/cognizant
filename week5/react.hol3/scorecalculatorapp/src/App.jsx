import React from 'react'
import CalculateScore from './components/CalculateScore.jsx'

export default function App() {
  return (
    <div className="App">
      <h1>Score Calculator</h1>
      <CalculateScore Name="Aman" School="Springfield High" Total={420} goal={6} />
    </div>
  )
}
