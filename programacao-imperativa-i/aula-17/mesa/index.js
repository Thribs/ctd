// Crie uma função que receba um array composto por números e retorna uma nova matriz (array) com todos os valores divididos pela soma de toda a matriz, usando map() e reduce().
const arrayNumbers = [32, 23, 3, 533, 4];

const somaPelaDivisao = (array) => {
    const soma = array.reduce( (acc, item) => { return acc + item})
    return array.map(i => {return i/soma})
};

console.log(somaPelaDivisao(arrayNumbers));

// Crie uma função que receba um array de palavras e um número, e que retorna uma matriz (array) com apenas as palavras que têm mais do que uma quantidade de letras maior do que o número informado. (verifique como funciona o método filter ())
const arrayPalavras = ['carro', 'roberto', 'ovo', 'cachorro']

// const maisLetrasQueONum = function(array, num)

// Crie um array de objetos literais, onde cada objeto será um aluno e terá dois atributos: nome e nota. Crie duas funções que ordenam o array: uma ordenará os alunos em ordem alfabética e a outra o fará por nota, da mais alta para a mais baixa. (Analise qual método seria apropriado para este caso. Recomendamos que você consulte a documentação do MDN: https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Reference/Global_Objects/Array)
// Exercício Integrador
//
// Temos que fazer um sistema para um Agricultor controlar suas vendas. Ele tem um controle de vendas em um caderno, onde os produtos estão organizados por nome, preço e quantidade vendida.
// Portanto, crie um array de objetos literais com essas informações. No sistema, você tem que adicionar uma função (ou várias) que realize os seguintes passos:
// Calcular o lucro total de todos os produtos;
// Permitir pesquisar um produto pelo nome e calcular seu lucro total;
// Permite receber um valor e indicar todos os produtos que venderam mais que esse valor;
//  Classifique todos os produtos pela quantidade de dinheiro que geraram.
// Encontre um produto e atribua a ele um novo valor (reutilize o código que permite encontrar o produto pelo nome).
// Calcule o lucro total após pagar 45% do lucro em impostos.
