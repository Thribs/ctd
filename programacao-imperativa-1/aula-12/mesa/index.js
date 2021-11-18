const alicia = [23, 69, 32];
const bob = [12, 67, 43];

function getWinner(c1, c2) {
    let totalScoreC1 = 0;
    let totalScoreC2 = 0;

    c1.forEach(scoreC1 => {
        c2.forEach(scoreC2 => {
            if (scoreC1 > scoreC2) totalScoreC1++
            if (scoreC2 > scoreC1) totalScoreC2++
        }
            )
    })
    
    if (totalScoreC1 == totalScoreC2) return "Empate!"
    return totalScoreC1 > totalScoreC2 ? "O ganhador é o participante 1!" : "O ganhador é o participante 2!"
}

console.log(getWinner(alicia, bob));
console.log(getWinner(bob, alicia));
console.log(getWinner(alicia, alicia));


