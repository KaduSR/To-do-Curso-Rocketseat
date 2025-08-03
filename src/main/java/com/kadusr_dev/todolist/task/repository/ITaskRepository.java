package com.kadusr_dev.todolist.task.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadusr_dev.todolist.task.model.TaskModel;


public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {    
    List<TaskModel> findByIdUser(UUID idUser);
}