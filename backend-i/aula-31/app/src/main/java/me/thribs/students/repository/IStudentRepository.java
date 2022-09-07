package me.thribs.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.thribs.students.entity.StudentEntity;

public interface IStudentRepository extends JpaRepository<StudentEntity, Long> { }