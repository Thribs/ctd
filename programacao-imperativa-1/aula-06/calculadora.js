function sum(a, b) { return a + b };
function subtract(a, b) { return a - b };
function multiply(a, b) { return a * b };
function divide(a, b) { return a / b };

console.log("-------------- Teste de Operações / Calculadora --------------");

console.log(sum(10, 2));
console.log(subtract(10, 2));
console.log(multiply(10, 2));
console.log(divide(10, 0));

function squareNumber(a) {
    return a * a;
};

function averageOfthree(a, b, c) {
    return divide(sum(sum(a, b), c), 3);
};

function percentage(a,b) {
    return multiply(divide(a,b),100);
};

function percentageIGuess(a,b) {
    return multiply(divide(a,b),100)
}

const [a,b,c] = [2,10,5]

console.log(squareNumber(a));
console.log(averageOfthree(a, b, c));
console.log(percentage(a,b));
console.log(percentageIGuess(a,b));