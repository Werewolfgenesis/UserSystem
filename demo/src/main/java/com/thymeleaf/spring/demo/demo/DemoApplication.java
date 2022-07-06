package com.thymeleaf.spring.demo.demo;

import com.thymeleaf.spring.demo.demo.model.User;
import com.thymeleaf.spring.demo.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner{
	@Autowired UserRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.save(new User(Long.valueOf(1), "nasky", "nasku", "123"));
		repo.save(new User(Long.valueOf(33), "Dimitar", "mitko", "!23"));
	}
}
