package com.thymeleaf.spring.demo.demo.service;

import com.thymeleaf.spring.demo.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User findById(Long id);

    User findByName(String fullName);

    List<User> findAllUsers();

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(Long id);
}
