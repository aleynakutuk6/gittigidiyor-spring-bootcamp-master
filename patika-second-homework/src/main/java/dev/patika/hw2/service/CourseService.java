package dev.patika.hw2.service;

import dev.patika.hw2.dao.CourseDAOImpl;
import dev.patika.hw2.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService implements  BaseService<Course>{

    private CourseDAOImpl courseDAOJPA;

    @Override
    public List<Course> findAll() {
        return courseDAOJPA.findAll();
    }

    @Override
    public Course findById(int id) {
        return courseDAOJPA.findById(id);
    }

    @Override
    public Course save(Course course) {
        return (Course) courseDAOJPA.save(course);
    }

    @Override
    public void deleteById(int id) {
        courseDAOJPA.deleteById(id);
    }
}
