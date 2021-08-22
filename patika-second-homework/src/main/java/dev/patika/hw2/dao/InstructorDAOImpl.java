package dev.patika.hw2.dao;

import dev.patika.hw2.model.Instructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class InstructorDAOImpl implements BaseDAO<Instructor> {

    private EntityManager entityManager;

    public InstructorDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Instructor> findAll() {
        return entityManager.createQuery("from Instructor i", Instructor.class).getResultList();
    }

    @Override
    public Instructor findById(int id) {
        return (Instructor)entityManager.find(Instructor.class, id);
    }

    @Override
    @Transactional
    public Instructor save(Instructor instructor) {
        return entityManager.merge(instructor);
    }

    @Override
    public void deleteById(int id) {
        Instructor foundInstructor = (Instructor)entityManager.find(Instructor.class, id);
        entityManager.remove(foundInstructor);
    }
}
