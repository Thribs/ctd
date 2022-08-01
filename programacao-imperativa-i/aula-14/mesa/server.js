const http = require("http");

const server = http.createServer(function (req, res) {
  res.write("Hello, world!"); // escreve uma resposta para o cliente
  res.end(); // finaliza a resposta
});

server.listen(8000, console.log("Servidor rodando na porta 8000")); // o servidor "escuta" na porta 8000
