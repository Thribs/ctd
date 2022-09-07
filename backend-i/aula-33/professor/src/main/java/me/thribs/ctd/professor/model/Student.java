package me.thribs.ctd.professor.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "students")
public class Student {

    @Id
    @SequenceGenerator(name = "aluno_sequence", sequenceName = "aluno_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aluno_sequence")
    private @Getter @Setter Long id;
    private @Getter @Setter String name;
    private @Getter @Setter Long ageInYears;
    
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "professor_id")
    private Student student;

    public Student(String name, Long ageInYears) {
        this.name = name;
        this.ageInYears = ageInYears;
    }
    
}
