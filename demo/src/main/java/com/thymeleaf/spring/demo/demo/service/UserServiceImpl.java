package com.thymeleaf.spring.demo.demo.service;


import com.thymeleaf.spring.demo.demo.model.User;
import com.thymeleaf.spring.demo.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo repo;

    @Override
    public User findById(Long id) {
        return repo.findById(id).orElseThrow(() -> {
            throw new EntityNotFoundException();
        });
    }

    @Override
    public User findByName(String fullName) {
        return repo.findUserByFullName(fullName);
    }

    @Override
    public List<User> findAllUsers() {
        return repo.findAll();
    }

    @Override
    public User createUser(User user) {
        return repo.save(user);
    }

    @Override
    public User updateUser(User user) {
        return repo.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        repo.deleteById(id);
    }
}
