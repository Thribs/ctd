package me.thribs.ctd.professor.model;

import java.util.Set;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "professor")
public class Professor {

    @Id
    @SequenceGenerator(name = "professor_sequence", sequenceName = "professor_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "professor_sequence")
    private @Getter Long id;
    private @Getter @Setter String name;
    private @Getter @Setter String title;

    @OneToMany(mappedBy = "professor", fetch = FetchType.LAZY)
    private @Getter Set<Student> students = new HashSet<Student>();

    public Professor(String name, String title) {
        this.name = name;
        this.title = title;
    }    
    
}
 