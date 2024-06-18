package com.example.taskmanager;

import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerExample {

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/tasks")
    public String getTasks() {
        return "List of tasks";
    }

    @PostMapping("/tasks")
    public String createTask(@RequestBody String task) {
        return "Task created: " + task;
    }
}