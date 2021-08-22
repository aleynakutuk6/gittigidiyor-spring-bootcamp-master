package dev.patika.hw2.service;

import java.util.List;

public interface BaseService<T> {

    List<T> findAll();
    T findById(int id);
    T save(T obj);
    void deleteById(int id);



}
