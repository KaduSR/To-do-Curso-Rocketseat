package com.kadusr_dev.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kadusr_dev.todolist.model.UserModel;
import com.kadusr_dev.todolist.repository.IUserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/novo")
    public void create(@RequestBody UserModel userModel) {

        System.out.println(userModel.getNome());
    }

}
