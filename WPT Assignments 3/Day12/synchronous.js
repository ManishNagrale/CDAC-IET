const fs = require('fs');

fs.writeFileSync('example.txt', 'Hello, this is synchronous write!');

const data = fs.readFileSync('example.txt', 'utf8');
console.log('Synchronous read:', data);
