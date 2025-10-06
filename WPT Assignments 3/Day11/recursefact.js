const n = parseInt(process.argv[2]);

function factorial(x) {
  if (x == 0) return 1;
  return x * factorial(x - 1);
}

console.log(factorial(n));
