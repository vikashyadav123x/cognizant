function IndianPlayers() {
  const team = ["Virat", "Rohit", "Gill", "Rahul", "Pant", "Hardik"];

  const oddPlayers = team.filter((_, index) => index % 2 === 0);
  const evenPlayers = team.filter((_, index) => index % 2 !== 0);

  const T20Players = ["Virat", "Rohit", "Surya"];
  const RanjiPlayers = ["Pujara", "Rahane", "Iyer"];

  const mergedPlayers = [...T20Players, ...RanjiPlayers];

  return (
    <>
      <h2>Odd Team Players</h2>

      {oddPlayers.map((player, index) => (
        <p key={index}>{player}</p>
      ))}

      <h2>Even Team Players</h2>

      {evenPlayers.map((player, index) => (
        <p key={index}>{player}</p>
      ))}

      <h2>Merged Players</h2>

      {mergedPlayers.map((player, index) => (
        <p key={index}>{player}</p>
      ))}
    </>
  );
}

export default IndianPlayers;
