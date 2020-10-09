package com.example.demo.repository;

import com.example.demo.model.TodoList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends MongoRepository<TodoList, String> {
    public TodoList deleteById(int id);
}
