function Student(name, classesMissed, grades) {
    this.name = name;
    this.classesMissed = classesMissed;
    this.grades = grades;
    this.averageGrade = function() {
        let total = 0
        this.grades.forEach(grade => 
            total += grade
        )
        const average = total / this.grades.length
    
        return average
    }
    this.absence = function() { this.classesMissed++ }
}

const students = [
    new Student('Arthur Campolina', 0, [10, 8, 6, 8, 5]),
    new Student('Cristian Fernandes', 0, [10, 8, 6, 8, 5]),
    new Student('Felipe Santos ', 0, [10, 8, 6, 8, 1]),
    new Student('Kened Silva', 0, [10, 8, 6, 8, 5]),
    new Student('Rodrigo Costa Valle', 0, [10, 8, 6, 8, 5]),
    new Student('Thiago Silva', 0, [10, 8, 6, 8, 5]),
];

module.exports = [students, Student];