package com.example.demo.service;

import com.example.demo.model.TodoList;
import com.example.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public TodoList add(String subject){
        return todoRepository.save(new TodoList(subject));
    }

    public List<TodoList> getAll(){
        return todoRepository.findAll();
    }
}
