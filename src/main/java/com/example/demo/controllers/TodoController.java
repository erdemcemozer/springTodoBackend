package com.example.demo.controllers;

import com.example.demo.model.TodoList;
import com.example.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class TodoController {

    @Autowired
    private TodoService todoService; // To access service, for passing datas.

    @RequestMapping(value = "/add", method = RequestMethod.POST) // Method for adding an item to database.
    public TodoList add(@RequestBody(required = false) TodoList todo){
        System.out.println("test1: Subject "+ todo.getSubject());
        return todoService.add(todo);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET) // Method for getting all items from database.
    public @ResponseBody List<TodoList> getAll(){
        return todoService.getAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST) // Method for deleting an item from database.
    public TodoList delete(@RequestBody(required = false) TodoList todo){
        String id = todo.getId();
        todoService.deleteById(id);
        System.out.println("test deleteddddddd: " + todo.getId());
        return todo;
    }
}
