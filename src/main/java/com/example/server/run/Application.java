package com.example.server.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
            "com.example.server.model"
            })
@EnableJpaRepositories(basePackages = {
            "com.example.server.repository"
            })
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}