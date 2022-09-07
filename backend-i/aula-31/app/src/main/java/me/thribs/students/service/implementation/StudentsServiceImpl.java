package me.thribs.students.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import me.thribs.students.entity.StudentEntity;
import me.thribs.students.repository.IStudentRepository;
import me.thribs.students.service.IStudentsService;

@Service
public class StudentsServiceImpl implements IStudentsService<StudentEntity> {

    private final IStudentRepository repository;    

    public StudentsServiceImpl(IStudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public StudentEntity add(StudentEntity student) {
    if (student != null) { return (StudentEntity) repository.save(student); }
    return new StudentEntity();
    }

    @Override
    public List<StudentEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<StudentEntity> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void update(StudentEntity student) {
        if (student == null) { throw new IllegalArgumentException("Student must not be null"); }
        Long id = student.getId();
        if (getById(id) == null) { throw new IllegalArgumentException("Repository must not be null"); }
        repository.deleteById(id);
    }


    @Override
    public void remove(Long id) {
        if (getById(id).isPresent()) { repository.deleteById(id); }
        else { throw new IllegalStateException("Cannot remove student " + id); }
    }

    

}
