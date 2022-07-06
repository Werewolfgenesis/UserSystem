package com.thymeleaf.spring.demo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity @Table(name = "users") @AllArgsConstructor @NoArgsConstructor @Data
public class User {
    @Id// @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "CUSTOMER_NAME")
    String fullName;

    @Column(nullable = false)
    String username;

    @Column(nullable = false)
    String password;
}
