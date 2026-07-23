import React, { useState } from 'react'
import ListofPlayers from './components/ListofPlayers'
import IndianPlayers from './components/IndianPlayers'

export default function App() {
  const [flag] = useState(true)

  return (
    <main className="app-shell">
      <header className="hero">
        <h1>Cricket App</h1>
        <p>Flag is {String(flag)}</p>
      </header>

      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </main>
  )
}
