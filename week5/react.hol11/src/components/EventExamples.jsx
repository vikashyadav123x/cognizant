import { useState } from "react";

function EventExamples() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    alert("Hello! Have a nice day.");
  };

  const increaseAndHello = () => {
    increment();
    sayHello();
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const onPress = (e) => {
    alert("I was clicked");
    console.log(e);
  };

  return (
    <div>
      <h2>Event Examples</h2>

      <h3>Counter: {count}</h3>

      <button onClick={increaseAndHello}>Increment</button>

      <button onClick={decrement}>Decrement</button>

      <br />
      <br />

      <button onClick={() => sayWelcome("Welcome")}>Say Welcome</button>

      <br />
      <br />

      <button onClick={onPress}>OnPress</button>
    </div>
  );
}

export default EventExamples;
