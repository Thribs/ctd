const alicia = [23, 69, 32];
const bob = [12, 67, 43];

function getWinner(c1, c2) {
    let scoreC1 = 0;
    let scoreC2 = 0;

    for (let i = 0; i < c1.length; i++) {
        if (c1[i] > c2[i]) { scoreC1++ }
        if (c2[i] > c1[i]) { scoreC2++ }
    }
    if (scoreC1 > scoreC2) { return "o participante 1 ganhou!"};
    if (scoreC2 > scoreC1) { return "o participante 2 ganhou!"};
    if (scoreC1 === scoreC2) { return "Empate!"}
}

console.log(getWinner(alicia, bob));
console.log(getWinner(bob, alicia));
console.log(getWinner(alicia, alicia));

// BÔNUS //

function digitalHouse(n, m) {
    for (let i = 1; i <= 100; i++) {
        console.log(i);
        if (i%n == 0 && i%m == 0) console.log("Digital House")
        else {
            if (i%n == 0) console.log("Digital");
            if (i%m == 0) console.log("House");
        }
    }
}

digitalHouse(2, 5);

const isNumber = function isNumber(value) 
{
   return typeof value === 'number' && isFinite(value);
}

function sumArray(umArray) {
    let sum = 0;

    for (let i = 0; i < umArray.length; i++) {
        if (!isNumber(umArray[i])) return "Erro: a matriz contém elementos não númericos."
        sum += umArray[i];
    };

    return sum;
}

console.log(sumArray([5,10,30]));