import React, { useState, useEffect } from 'react';

// Factorial component takes a number as a prop and calculates factorial using state
function Factorial({ number }) {
  const [factorial, setFactorial] = useState(1);

  useEffect(() => {
    function calculateFactorial(n) {
      if (n < 0) return 0; // factorial not defined for negative numbers
      let result = 1;
      for (let i = 1; i <= n; i++) {
        result *= i;
      }
      return result;
    }

    setFactorial(calculateFactorial(number));
  }, [number]);

  return (
    <div>
      <h3>Factorial</h3>
      <p>Number: {number}</p>
      <p>Factorial: {factorial}</p>
    </div>
  );
}

// Calculator component takes two numbers and an operation and shows the result using state
function Calculator({ num1, num2, operation }) {
  const [result, setResult] = useState(null);

  useEffect(() => {
    let res;
    switch (operation) {
      case 'add':
        res = num1 + num2;
        break;
      case 'subtract':
        res = num1 - num2;
        break;
      case 'multiply':
        res = num1 * num2;
        break;
      case 'divide':
        res = num2 !== 0 ? num1 / num2 : 'Error: Divide by zero';
        break;
      default:
        res = 'Invalid operation';
        break;
    }
    setResult(res);
  }, [num1, num2, operation]);

  return (
    <div>
      <h3>Calculator</h3>
      <p>Number 1: {num1}</p>
      <p>Number 2: {num2}</p>
      <p>Operation: {operation}</p>
      <p>Result: {result}</p>
    </div>
  );
}

// Example usage of both components together on an HTML page
export default function App() {
  return (
    <div>
      <Factorial number={5} />
      <Calculator num1={10} num2={2} operation="add" />
      <Calculator num1={10} num2={2} operation="subtract" />
      <Calculator num1={10} num2={2} operation="multiply" />
      <Calculator num1={10} num2={2} operation="divide" />
      <Calculator num1={10} num2={0} operation="divide" /> {/* Divide by zero case */}
    </div>
  );
}
