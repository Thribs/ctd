package me.thribs.students.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String studentId;
    private String firstName;
    private String lastName;

    public StudentEntity(Long id, String studentId, String firstName, String lastName) {
        this.id = id;
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public StudentEntity(String studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public StudentEntity() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "StudentEntity [firstName=" + firstName + ", lastName=" + lastName + ", studentId=" + studentId + "]";
    }

    
    

    
    
}
