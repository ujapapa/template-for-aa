package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

    @GetMapping("/")
    public String home() {
        return "todoList";
    }

    @ResponseBody
    @GetMapping("/api/v1/user")
    public Integer getUserId(){
        Integer userId = 82058465;
        return userId;
    }
}
