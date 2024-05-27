package com.example.taskmanager.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.taskmanager.model.Task;

public interface TaskRepository extends MongoRepository<Task, String> {

}
