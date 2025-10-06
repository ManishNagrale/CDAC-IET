const http = require('http');
const todos = [
  { id: 1, task: "Learn Node.js" },
  { id: 2, task: "Build a REST API" },
  { id: 3, task: "Write tests" },
];

http.createServer((req, res) => {
  const [ , base, id ] = req.url.split('/');

  if (base === 'todos') {
    if (!id) {
      res.writeHead(200, { 'Content-Type': 'application/json' });
      return res.end(JSON.stringify(todos));
    }

    const todo = todos.find(t => t.id === +id);
    if (todo) {
      res.writeHead(200, { 'Content-Type': 'text/html' });
      return res.end(`<h1>Todo #${todo.id}</h1><p>${todo.task}</p>`);
    }
  }

  res.writeHead(404, { 'Content-Type': 'text/plain' });
  res.end('Not Found');
}).listen(3000, () => console.log('Server running on http://localhost:3000'));
