
export function factorial(n) {
  if (n <= 1) return 1;
  return n * factorial(n - 1);

  function factorial(n) {
  if (n <= 1) return 1;
  return n * factorial(n - 1);
}

function MyComponent(props) {
  return <div>Factorial of 5 is {factorial(5)}</div>;
}

}
