const n = +process.argv[2];
if (n < 1 || n > 5) {
  console.log("Error");
  process.exit();
}
for(let i=n; i>0; i--) {
  console.log("* ".repeat(i));
}
