console.log("\n// Tem-se um conjunto de dados contendo a altura e o sexo (M ou F) de 15 pessoas. Faça um programa que calcule e escreva:");
const people = [
  {
    sexo: "F",
    nome: "Abigael Natte",
    altura: "1.61",
  },
  {
    sexo: "M",
    nome: "Ramon Connell",
    altura: "1.75",
  },
  {
    sexo: "M",
    nome: "Jarret Lafuente",
    altura: "1.55",
  },
  {
    sexo: "F",
    nome: "Ansel Ardley",
    altura: "1.67",
  },
  {
    sexo: "F",
    nome: "Jacki Shurmer",
    altura: "1.75",
  },
  {
    sexo: "M",
    nome: "Jobi Mawtus",
    altura: "1.88",
  },
  {
    sexo: "M",
    nome: "Thomasin Latour",
    altura: "1.67",
  },
  {
    sexo: "F",
    nome: "Lonnie Verheijden",
    altura: "1.63",
  },
  {
    sexo: "M",
    nome: "Alonso Wannan",
    altura: "1.92",
  },
  {
    sexo: "F",
    nome: "Bendite Huggett",
    altura: "1.80",
  },
  {
    sexo: "M",
    nome: "Jobi Mawtus",
    altura: "1.88",
  },
  {
    sexo: "M",
    nome: "Thomasin Latour",
    altura: "1.67",
  },
  {
    sexo: "F",
    nome: "Lonnie Verheijden",
    altura: "1.63",
  },
  {
    sexo: "M",
    nome: "Alonso Wannan",
    altura: "1.92",
  },
  {
    sexo: "F",
    nome: "Bendite Huggett",
    altura: "1.80",
  },
];

console.log("\n// a maior e a menor altura do grupo;");
const tallest = (group) => {
  let maxHeight = 0;
  group.forEach((person) => {
    if (person.altura > maxHeight) maxHeight = Number(person.altura);
  });
  return maxHeight;
};
const shortest = (group) => {
  let minHeight = 0;
  group.forEach((person) => {
    if (minHeight == 0) minHeight = Number(person.altura);
    if (person.altura < minHeight) minHeight = Number(person.altura);
  });
  return minHeight;
};
console.log(tallest(people));
console.log(shortest(people));

console.log("\n// a média de altura das mulheres;");
const averageWomanHeight = (group) => {
  const womenGroup = group.filter((person) => person.sexo == "F");
  const heightsArray = womenGroup.map((person) => Number(person.altura));
  const average = heightsArray.reduce((average, current) =>
    Number(((average + current) / 2).toFixed(2))
  );
  return average;
};
console.log(averageWomanHeight(people));

console.log("\n// o número de homens.");
const countOfMen = (group) => {
    menGroup = group.filter((person) => person.sexo == "M");
    return menGroup.length;
};
console.log(countOfMen(people));