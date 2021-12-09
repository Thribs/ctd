console.log("// Micro desafio - Passo 3");
console.log("// Em um arquivo diferente, crie o objeto literal curso que tem como atributos: nome do curso (string), nota de aprovação (number), faltas máximas (number) e uma  de estudantes lista(um array composto pelos alunos criados no passo 1).");
const [students, Student] = require('./students');

const course = {
    name: "Programação Imperativa",
    cutoffGrade:8,
    maximumAbsence: 4,
    students: students,
    newStudent: function(student) { students.push(student) },
    approveStudent: function(student) { return student.averageGrade() >= course.cutoffGrade && student.classesMissed < course.maximumAbsence || student.averageGrade() * 1.1 >= course.cutoffGrade },
    approved: function() { return this.students.map(student => {
        return course.approveStudent(student)
    }) }
}

console.log(course.approveStudent(students[0]));

module.exports = [course, Student];