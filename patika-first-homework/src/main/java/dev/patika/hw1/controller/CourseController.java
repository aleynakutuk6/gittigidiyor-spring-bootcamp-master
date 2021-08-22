package dev.patika.hw1.controller;

import dev.patika.hw1.model.Course;
import dev.patika.hw1.service.CourseService;

import java.util.List;

public class CourseController {

    private CourseService courseService = new CourseService();

    public Course findCourse(int courseId){
        return courseService.findById(courseId);
    }
    public List<Course> findAllCourses(){
        return courseService.findAll();
    }
    public void saveCourse(Course course){
        courseService.save(course);
    }
    public void deleteById(int id){
        courseService.deleteById(id);
    }

}
