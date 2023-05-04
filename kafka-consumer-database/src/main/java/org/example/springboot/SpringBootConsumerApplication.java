package org.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConsumerApplication {
    public static void main(String[] args) {
        System.out.println("inside main");
        SpringApplication.run(SpringBootConsumerApplication.class);
    }
}
