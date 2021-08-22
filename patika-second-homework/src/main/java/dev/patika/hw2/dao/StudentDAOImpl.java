package dev.patika.hw2.dao;

import dev.patika.hw2.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentDAOImpl implements BaseDAO<Student>{

    private EntityManager entityManager;

    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("from Student s", Student.class).getResultList();
    }

    @Override
    public Student findById(int id) {
        return (Student)entityManager.find(Student.class, id);
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return entityManager.merge(student);
    }

    @Override
    public void deleteById(int id) {
        Student foundStudent = (Student)entityManager.find(Student.class, id);
        entityManager.remove(foundStudent);
    }
}
