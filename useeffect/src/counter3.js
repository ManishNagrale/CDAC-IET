import React, { useState, useEffect } from "react";

export default function Counts() {
  const [count, setCount] = useState(0);
  const [countHistory, setCountHistory] = useState([]);
  useEffect(() => {
    if (count > 0) {
      setCountHistory((prevHistory) => [...prevHistory, count]);
    }
  }, [count]);

  const increment = () => {
    setCount(count + 1);
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const reset = () => {
    setCount(0);
    setCountHistory([]);
  };

  return (
    <div>
      <h2>Counter Application</h2>
      <p>Count: {count}</p>
      <button onClick={increment}> Increment </button>
      <button onClick={decrement}> Decrement </button>
      <button onClick={reset}> Reset </button>

      {countHistory.length > 0 && (
        <table border="1" style={{ marginTop: "20px" }}>
          <thead>
            <tr>
              <th>Increment #</th>
              <th>Count Value</th>
            </tr>
          </thead>
          <tbody>
            {countHistory.map((val, index) => (
              <tr key={index}>
                <td>{index + 1}</td>
                <td>{val}</td>
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </div>
  );
}
