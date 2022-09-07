package me.thribs.students.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.thribs.students.entity.StudentEntity;
import me.thribs.students.service.implementation.StudentsServiceImpl;

@RestController
public class StudentsController {

    private final StudentsServiceImpl service;

    public StudentsController(StudentsServiceImpl service) { this.service = service; }

    @RequestMapping(value = "/students", method = RequestMethod.GET, produces = "application/json")
    public List<StudentEntity> getAll() { return service.getAll(); }

    @GetMapping("/students/{id}")
    public Optional<StudentEntity> getById(@PathVariable Long id) { return service.getById(id); }

    @PostMapping("/students/")
    public String add(@RequestBody StudentEntity student) { 
        service.add(student);
        return "student" + student + "added";
     }

    @PutMapping("/students/")
    public String update(@RequestBody StudentEntity student) { 
        service.update(student);
        return "student" + student + "updated";
     }

    @DeleteMapping("/students/{id}")
    public String remove(@PathVariable Long id) { 
        service.remove(id);
        Optional<StudentEntity> student = service.getById(id);
        return "student" + student + "removed";
     }

}
