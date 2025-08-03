package com.kadusr_dev.todolist.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kadusr_dev.todolist.model.UserModel;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/novo")
    public void create(@RequestBody UserModel userModel) {

        System.out.println(userModel.getNome());
    }

}
