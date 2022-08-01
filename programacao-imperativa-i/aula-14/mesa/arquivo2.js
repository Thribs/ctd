const functions = require("./arquivo");
const subtractF = functions.subtractF;
const sumF = functions.sumF;

const  { subtractF:sub, sumF:sum } = require("./arquivo")

console.log(functions);
console.log(functions.subtractF);
console.log(functions.sumF);
console.log(sub(5, 2));
console.log(sum(5, 2));