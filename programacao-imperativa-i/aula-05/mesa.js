// Micro desafio 1
function teste1(x, y) {
    return y - x;
};

teste1(10, 40)
// Nada é exibido
// O valor é calculado e o programa acaba

// Micro desafio 2
function teste2(x, y) {
    return x * 2;
    console.log(x);
    return x / 2;
};

teste2(10);
// É exibido no console o resultado 20

// Funções simples
// 1
function inToCm(inches) {
    return inches * 2.54;
};

// 2
function stringToUrl(word) {
    return `https://${word}.space`;
};
// 3
function exclamate(phrase) {
    return phrase + '!';
};

// 4
function canineAge(humanAge) {
    return humanAge * 7;
};

// 5
function hourlyWage(monthlyWage) {
    return monthlyWage / 160;
};

// 6
function bmi(mass, height) {
    return mass / (height * height);
}

// 7
// a função <string>.toUpperCase() faz exatamente isso. Não é necessário outra função

// 8
function typeOf(data) {
    return typeof data;
}

// 9
function circumference(radius) {
    return (Math.PI * 2) * radius;
};

const data = 23.45

results = [inToCm(21), stringToUrl('thribs'), exclamate('Não use pontos de exclamação em excesso'), canineAge(3), hourlyWage(1400.00), bmi(80, 1.75), ("caps".toUpperCase()), typeOf(data), circumference(20.00)];

results.map((i) => {
    console.log(i);
})