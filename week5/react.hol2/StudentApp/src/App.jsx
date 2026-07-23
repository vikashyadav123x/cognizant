import React from "react";
import Home from "./components/Home";
import About from "./components/About";
import Contact from "./components/Contact";

export default function App() {
  return (
    <div className="App">
      <h1>Student Management Portal</h1>
      <Home />
      <About />
      <Contact />
    </div>
  );
}
