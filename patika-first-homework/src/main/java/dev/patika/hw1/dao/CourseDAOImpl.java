package dev.patika.hw1.dao;

import dev.patika.hw1.model.Course;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CourseDAOImpl implements BaseDAO<Course>{

    private EntityManager entityManager;

    public CourseDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Course> findAll() {
        return entityManager.createQuery("from Course c", Course.class).getResultList();
    }

    @Override
    public Course findById(int id) {
        return (Course)entityManager.find(Course.class, id);
    }

    @Override
    @Transactional
    public Course save(Course course) {
        return entityManager.merge(course);
    }

    @Override
    public void deleteById(int id) {
        Course foundCourse = (Course)entityManager.find(Course.class, id);
        entityManager.remove(foundCourse);
    }
}
