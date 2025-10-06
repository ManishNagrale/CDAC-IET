function multiplyIfPositive(a, b) {
  return new Promise((res, rej) => {
    if (a > 0 && b > 0) res(a * b);
    else rej("Numbers must be positive");
  });
}

multiplyIfPositive(2, 3)
  .then(result => console.log(result))
  .catch(err => console.log(err));
