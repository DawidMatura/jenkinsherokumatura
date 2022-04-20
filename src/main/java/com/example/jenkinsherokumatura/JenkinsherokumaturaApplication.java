package com.example.jenkinsherokumatura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsherokumaturaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsherokumaturaApplication.class, args);
    }

    @GetMapping
    public String get(){
        return "Hello Jenkins";
    }
}

