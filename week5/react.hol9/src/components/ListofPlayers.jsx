function ListofPlayers() {
  const players = [
    { name: "Virat Kohli", score: 95 },
    { name: "Rohit Sharma", score: 82 },
    { name: "Shubman Gill", score: 67 },
    { name: "KL Rahul", score: 55 },
    { name: "Hardik Pandya", score: 74 },
    { name: "Ravindra Jadeja", score: 61 },
    { name: "Rishabh Pant", score: 88 },
    { name: "Surya Kumar", score: 91 },
    { name: "Ashwin", score: 45 },
    { name: "Bumrah", score: 72 },
    { name: "Shami", score: 65 },
  ];

  const lowScorePlayers = players.filter((player) => player.score < 70);

  return (
    <>
      <h2>List of Players</h2>

      {players.map((player, index) => (
        <p key={index}>
          {player.name} - {player.score}
        </p>
      ))}

      <h2>Players with score below 70</h2>

      {lowScorePlayers.map((player, index) => (
        <p key={index}>
          {player.name} - {player.score}
        </p>
      ))}
    </>
  );
}

export default ListofPlayers;
