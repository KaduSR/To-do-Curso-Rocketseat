package com.kadusr_dev.todolist.task.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadusr_dev.todolist.task.model.TaskModel;


public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
    TaskModel findByTitle(String title);
    
}
