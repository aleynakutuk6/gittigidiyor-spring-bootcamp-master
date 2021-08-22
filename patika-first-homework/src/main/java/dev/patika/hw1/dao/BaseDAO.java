package dev.patika.hw1.dao;

import java.util.List;

public interface BaseDAO<T>{
    List<T> findAll();
    T findById(int id);
    T save(T obj);
    void deleteById(int id);
}
