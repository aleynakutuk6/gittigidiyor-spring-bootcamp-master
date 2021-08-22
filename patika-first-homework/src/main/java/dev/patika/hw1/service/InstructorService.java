package dev.patika.hw1.service;

import dev.patika.hw1.dao.InstructorDAOImpl;
import dev.patika.hw1.model.Instructor;

import java.util.List;

public class InstructorService implements  BaseService<Instructor>{

    private InstructorDAOImpl instructorDAOJPA;

    @Override
    public List<Instructor> findAll() {
        return instructorDAOJPA.findAll();
    }

    @Override
    public Instructor findById(int id) {
        return instructorDAOJPA.findById(id);
    }

    @Override
    public Instructor save(Instructor instructor) {
        return (Instructor) instructorDAOJPA.save(instructor);
    }

    @Override
    public void deleteById(int id) {
        instructorDAOJPA.deleteById(id);
    }
}