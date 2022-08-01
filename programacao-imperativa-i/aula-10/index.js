// Neste exercício, você terá que pensar sobre o que esses códigos retornam sem testá-lo no console.
let numbers = [22, 33, 54, 66, 72];
console.log(numbers[numbers.length]);
// numbers.length => 5
// numbers[5] => undefined

let grupoDeAmigos = [
  ["Harry", "Ron", "Hermione"],
  ["Spiderman", "Hulk", "Ironman"],
  ["Penélope Glamour", "Pierre Nodoyuna", "Patán"],
];
console.log(grupoDeAmigos[1][0]);
// grupoDeAmigos[1] => ["Spiderman", "Hulk", "Ironman"]
// ["Spiderman", "Hulk", "Ironman"][0] => "Spiderman"

let str = "una string qualquer";
let grupoDeAmigos = [
  [45, 89, 0],
  ["Digital", "House", true],
  ["string", "123", "false", 54, true, str],
];
console.log(grupoDeAmigos[2][grupoDeAmigos[2].length - 1]);
// grupoDeAmigos[2] => ["string", "123", "false", 54, true, str]
// grupoDeAmigos[2].length - 1 => 5
// ["string", "123", "false", 54, true, str][5] => "una string qualquer"

// Array Invertido
// Neste exercício, você terá que criar uma função que retorne um array com seus elementos invertidos, sem modificá-lo. Então, você deve fazer uma função que o modifique e inverta a ordem de seus elementos.
// 1. Crie a função imprimirInverso que pega um Array como um argumento e imprime cada elemento em ordem reversa no console (você não precisa inverter o Array).

function imprimirInverso(umArray) {
    console.log(umArray[2]);
    console.log(umArray[1]);
    console.log(umArray[0]);
}
imprimirInverso(['teste',1,2])

// 2. Crie a função inverter que recebe um Array como argumento e retorna um novo invertido.
function inverter(velho) {
  const novo = [];
  novo[0] = velho[2];
  novo[1] = velho[1];
  novo[2] = velho[0];
  return novo
}
console.log(inverter(['teste',1,2]));

function inverterEficiente(umArray) {return umArray.reverse()};
console.log(inverterEficiente(['teste',1,2]));

//somarArray();
// Neste exercício, você criará uma função somarArray() que aceita um array de números e retorna a soma de todos eles.
// Exemplo:
somarArray([1, 2, 3]); // 6
somarArray([10, 3, 10, 4]); // 27
somarArray([-5, 100]); // 95
function somarArray(umArray) {
  let soma = 0;
  soma += umArray.pop();
  soma += umArray.pop();
  soma += umArray.pop();
  soma += umArray.pop();
  soma += umArray.pop();
  return soma;
}
somarArray([5, 10, 20, 5, -5, 'a']);

// Simulação Array.join()
// Neste exercício, você criará uma função chamada join que recebe um array e simula o comportamento do método Array.join().
// Importante: Não poderá utilizar o método Array.join() original.
// Por exemplo:
join(["o", "l", "á"]); //deve retornar a string "olá".
join(["t", "c", "h", "a", "u"]); //deve retornar a string "tchau".
function join(umArray) {
  const concat = "";

  concat += umArray[0];
  concat += umArray[1];
  concat += umArray[2];
  concat += umArray[3];
  concat += umArray[4];

  return concat;
}

console.log(join(['a','r','r','a','y']));

// Coleções de Filmes (e mais…)
// O tech leader da equipe precisa conhecer a estrutura de dados do novo projeto. Para isso, devemos:
// 1. Criar a estrutura apropriada para armazenar os seguintes filmes e séries:
//     "star wars", "matrix",  "mr. robot", "o preço do amanhã",  "a vida é bela".
// Importante: verifique se tudo funciona corretamente acessando qualquer um dos filmes uma vez que a estrutura correspondente tenha sido criada.
//
// 2. Os filmes devem estar todos em letras maiúsculas. Para isso, crie uma função que recebe um array por parâmetro e converta o conteúdo de cada elemento em letras maiúsculas.
// Dica: revise o que faz o método de strings .toUpperCase().
//
// 1. Crie outra estrutura semelhante à primeira, mas com os seguintes filmes de animação:
//     "toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"
// Em seguida, crie uma função que receba dois arrays como parâmetros, para poder adicionar os elementos contidos no segundo array, dentro do primeiro, a fim de retornar um único array com todos os filmes como seus elementos.
//
// 4. Durante o processo, percebemos que o último elemento na série de filmes animados é, na verdade, um game. Agora devemos editar nosso código e modificá-lo para que possamos remover o último elemento antes de migrar o conteúdo para o array que contém todos os filmes.
// PS: por precaução, salve o elemento que você vai deletar em uma variável.
//
// 5. Finalmente, recebemos dois arrays com classificações feitas por diferentes usuários do mundo nos filmes com o seguinte formato:
const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];
// Crie uma função que compare as notas e nos diga se elas são iguais ou diferentes.
// Para verificar se tudo está bem até agora, recomendamos testar cada uma das funções, a fim de verificar seu correto funcionamento.
