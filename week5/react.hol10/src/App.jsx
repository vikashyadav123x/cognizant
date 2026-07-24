import "./App.css";

function App() {
  const offices = [
    {
      name: "DBS",
      rent: 50000,
      address: "Chennai",
      image:
        "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=800",
    },
    {
      name: "Regus",
      rent: 75000,
      address: "Bangalore",
      image:
        "https://images.unsplash.com/photo-1497366412874-3415097a27e7?w=800",
    },
    {
      name: "WeWork",
      rent: 90000,
      address: "Hyderabad",
      image:
        "https://images.unsplash.com/photo-1497366216548-37526070297c?w=800",
    },
  ];

  return (
    <div className="container">
      <h1>Office Space Rental App</h1>

      {offices.map((office, index) => (
        <div className="card" key={index}>
          <img src={office.image} alt={office.name} />

          <h2>{office.name}</h2>

          <p
            style={{
              color: office.rent < 60000 ? "red" : "green",
              fontWeight: "bold",
            }}
          >
            Rent: ₹{office.rent}
          </p>

          <p>Address: {office.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
