package me.thribs.ctd.professor.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
public abstract class Person {
    
    protected @Getter @Setter Long id;

}
