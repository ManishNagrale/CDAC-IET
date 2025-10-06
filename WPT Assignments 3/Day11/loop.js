setImmediate(function A() {
  console.log("1st immediate");
});

process.nextTick(function C() {
  console.log("1st process");
});
console.log("program started");

setTimeout(() => {
  console.log("timer executed");
}, 0);

Promise.resolve().then(() => {
  console.log("promise resolved");
});
