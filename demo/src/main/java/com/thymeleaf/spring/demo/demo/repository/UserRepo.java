package com.thymeleaf.spring.demo.demo.repository;

import com.thymeleaf.spring.demo.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findUserByFullName(String fullName);
}
