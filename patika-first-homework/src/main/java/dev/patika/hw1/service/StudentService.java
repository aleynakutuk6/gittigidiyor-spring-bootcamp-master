package dev.patika.hw1.service;


import dev.patika.hw1.dao.StudentDAOImpl;
import dev.patika.hw1.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements  BaseService<Student>{

    private StudentDAOImpl studentDAOJPA;

    @Override
    public List<Student> findAll() {
        return studentDAOJPA.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentDAOJPA.findById(id);
    }

    @Override
    public Student save(Student student) {
        return (Student) studentDAOJPA.save(student);
    }

    @Override
    public void deleteById(int id) {
        studentDAOJPA.deleteById(id);
    }
}
