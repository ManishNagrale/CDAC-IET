const fs = require('fs');

fs.writeFile('example.txt', 'Hello, this is asynchronous write!', (err) => {
  if (err) throw err;
  console.log('Asynchronous write complete');

 fs.readFile('example.txt', 'utf8', (err, data) => {
    if (err) throw err;
    console.log('Asynchronous read:', data);
  });
});
