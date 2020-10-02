package com.example.demo.controllers;

import com.example.demo.model.TodoList;
import com.example.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class TodoContoller {

    @Autowired
    private TodoService todoService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestParam String subject){
        TodoList todo = todoService.add(subject);
        return todo.toString();
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<TodoList> getAll(){
        return todoService.getAll();
    }
}
