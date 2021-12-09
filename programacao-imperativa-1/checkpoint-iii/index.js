const [course, Student] = require('./course');
const students = course.students;
const guineaPig = students[5];

console.log("// Micro desafio - Passo 1");
console.log("// Crie um objeto aluno que tenha como atributos: nome (string), quantidade de faltas (number) e notas (array de números). Crie um construtor para ele e importe-o como o módulo aluno.");
console.log(typeof students, typeof Student);

console.log("// Micro desafio - Passo 2");
console.log("// Nosso objeto aluno terá o método calcularMedia que retorna a média de suas notas. Também terá um método chamado faltas, que simplesmente aumenta o número de faltas em 1.");

console.log(guineaPig.averageGrade());
console.log(guineaPig.classesMissed);
guineaPig.absence();
console.log(guineaPig.classesMissed);


console.log("// Micro desafio - Passo 3");
console.log("// Em um arquivo diferente, crie o objeto literal curso que tem como atributos: nome do curso (string), nota de aprovação (number), faltas máximas (number) e uma  de estudantes lista(um array composto pelos alunos criados no passo 1).");
console.log(typeof course);


console.log("// Micro desafio - Passo 4");
console.log("// Crie o método que permite adicionar alunos à lista do curso, ou seja, quando chamamos nosso método em nosso objeto curso, deverá adicionar um aluno a mais na propriedade lista de estudantes do objeto curso.");
console.log(course.students.length+" alunos");
course.newStudent(guineaPig);
console.log(course.students.length+" alunos");

console.log("// Micro desafio - Passo 5");
console.log("// Crie um método para o objeto curso que receba um aluno (como parâmetro) e retorne true se ele aprovou no curso ou false em caso de reprovação. Para ser aprovado, o aluno tem que ter uma média igual ou acima da nota de aprovação  e ter menos faltas que faltas máximas. Se tiver a mesma quantidade, tem que estar 10% acima da nota de aprovação.");
console.log(guineaPig.averageGrade());
console.log(guineaPig.classesMissed);
console.log(course.approveStudent(guineaPig));


console.log("// Micro desafio - Passo 6");
console.log("// Crie um método para o objeto curso que percorra a lista de estudantes e retorne um array de booleanos com os resultados se os alunos aprovaram ou não.");
console.log(course.approved());

console.log("// Micro desafio - Passo 7");
console.log("// Importe o módulo estudantes.js, que contém uma lista de alunos, dentro do arquivo que contém o objeto curso. Substitua o conteúdo da propriedade lista de estudantes, pela lista de estudantes do arquivo estudantes.js e garanta que sigam funcionando todos os métodos corretamente. (revisar que o arquivo tenha todos os métodos corretamente).");
console.log(typeof students);