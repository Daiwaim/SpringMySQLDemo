package com.example.SpringMySQLDemo;

import com.example.SpringMySQLDemo.User.User;
import com.example.SpringMySQLDemo.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Demo implements CommandLineRunner {

    private final UserRepository repository;

    @Autowired
    public Demo(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) {
        repository.save(new User("truc"));
        repository.save(new User("chose"));
        for (User user : repository.findAll()) {
            System.out.println(user.getTokenSubject());
        }
    }
}
