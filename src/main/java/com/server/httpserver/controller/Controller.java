package com.server.httpserver.controller;

import com.server.httpserver.dao.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    private List<String> todoList = new ArrayList<>();

    @GetMapping("/all")
    private List<String> firstMethod(){
        return todoList;
    }

    @PostMapping("/add")
    private String addTodo(@RequestBody Todo task){
        todoList.add(task.getTask());
        return "task added";
    }
}
