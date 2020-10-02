package com.example.demo.repository;

import com.example.demo.model.TodoList;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<TodoList, String> {

}
