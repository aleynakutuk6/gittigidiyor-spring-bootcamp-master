package dev.patika.hw1.controller;

import dev.patika.hw1.model.Student;
import dev.patika.hw1.service.StudentService;

import java.util.List;

public class StudentController {

    private StudentService studentService = new StudentService();
    
    public Student findStudent(int id){
        return studentService.findById(id);
    }
    public List<Student> findAllStudents(){
        return studentService.findAll();
    }
    public void saveStudent(Student student){
        studentService.save(student);
    }
    public void deleteById(int id){
        studentService.deleteById(id);
    }

}
