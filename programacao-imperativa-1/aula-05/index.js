"use-strict";

function somar(a, b) {
    return ( a + b );
};

console.log(somar(10, 5));

function nomePessoa(name, age) {
    return `${name} tem ${age} anos de idade.`;
};

console.log(nomePessoa('Thiago', 27));
console.log(nomePessoa('Thiago', 27));
console.log(nomePessoa('Thiago', 27));

let sub = function (x, y) {
    console.log( x - y );
};

sub(10, 5);