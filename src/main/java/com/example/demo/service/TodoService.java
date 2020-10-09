package com.example.demo.service;

import com.example.demo.model.TodoList;
import com.example.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository; // To access repository.

    public TodoList add(TodoList todo){
        return todoRepository.save(todo);
    }

    public List<TodoList> getAll(){
        return todoRepository.findAll();
    }

    public void deleteById(String id) {
        todoRepository.deleteById(id);
        System.out.println("test delete : " + id);
    }
}
