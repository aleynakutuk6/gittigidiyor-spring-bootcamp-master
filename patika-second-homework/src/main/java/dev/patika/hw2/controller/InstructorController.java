package dev.patika.hw2.controller;

import dev.patika.hw2.model.Instructor;
import dev.patika.hw2.service.InstructorService;

import java.util.List;

public class InstructorController {

    private InstructorService instructorService = new InstructorService();
    
    public Instructor findInstructor(int id){
        return instructorService.findById(id);
    }
    public List<Instructor> findAllInstructors(){
        return instructorService.findAll();
    }
    public void saveInstructor(Instructor instructor){
        instructorService.save(instructor);
    }
    public void deleteById(int id){
        instructorService.deleteById(id);
    }

}
