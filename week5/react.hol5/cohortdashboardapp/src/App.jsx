import React from 'react'
import CohortDetails from './components/CohortDetails'

export default function App() {
  return (
    <main className="app-shell">
      <header className="hero">
        <p className="eyebrow">My Academy Team at Cognizant</p>
        <h1>Ongoing and Completed Cohorts</h1>
        <p className="subtitle">Styled using a CSS Module for the cohort details cards.</p>
      </header>
      <CohortDetails />
    </main>
  )
}
