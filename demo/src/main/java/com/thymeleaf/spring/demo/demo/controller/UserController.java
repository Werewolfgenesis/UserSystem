package com.thymeleaf.spring.demo.demo.controller;

import com.thymeleaf.spring.demo.demo.model.User;
import com.thymeleaf.spring.demo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public String allUsers(Model model){
        model.addAttribute("users", service.findAllUsers());
        return "index";
    }

//    @GetMapping("/{id}")
//    public String findById(@PathVariable("id") Long id, Model model){
//        return "user_view";
//    }
}
