const people = require('./people')

console.log("\n// Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e a sua opinião em relação ao filme: ótimo - 3, bom - 2, regular -1.");
console.log("\n// Faça um programa que receba a idade e a opinião de 15 espectadores, calcule e imprima:");
console.log("\n// a média das idades das pessoas que responderam ótimo;");
const averageAgeOfPeopleWhoAnsweredGreat = group => {
    if (typeof group !== "object") return `Erro: tipo de argumento fornecido (${typeof group}) errado.`
    const peopleWhoAnsweredGreat = group.filter(person => person.opniao == 3)
    let sumOfAges = 0
    peopleWhoAnsweredGreat.forEach(person => sumOfAges += person.idade)
    const average = sumOfAges / peopleWhoAnsweredGreat.length

    return average
}
console.log(averageAgeOfPeopleWhoAnsweredGreat(people));

console.log("\n// a quantidade de pessoas que responderam regular;");
const amountOfPeopleWhoAnsweredRegular = group => {
    if (typeof group !== "object") return `Erro: tipo de argumento fornecido (${typeof group}) errado.`
    const peopleWhoAnsweredRegular = group.filter(person => person.opniao == 1)
    const amount = peopleWhoAnsweredRegular.length

    return amount
}
console.log(amountOfPeopleWhoAnsweredRegular(people));

console.log("\n// a porcentagem de pessoas que responderam bom entre todos os espectadores analisados.");
const percentageOfPeopleWhoAnsweredGood = group => {
    if (typeof group !== "object") return `Erro: tipo de argumento fornecido (${typeof group}) errado.`
    const peopleWhoAnsweredGood = group.filter(person => person.opniao == 2)
    const amountOfPeople = peopleWhoAnsweredGood.length
    const percentage = (amountOfPeople / group.length) * 100
    const result = `${percentage}%`

    return result
}
console.log(percentageOfPeopleWhoAnsweredGood(people));

console.log(averageAgeOfPeopleWhoAnsweredGreat(2));
console.log(amountOfPeopleWhoAnsweredRegular());
console.log(percentageOfPeopleWhoAnsweredGood('a'));