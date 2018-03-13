package com.github.hronom.springboottestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootTestApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestApp.class, args);
    }
}
