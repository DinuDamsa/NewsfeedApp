package com.onlybook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

//@SpringBootApplication

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) // to be removed when security configuration class is implemented
public class OnlyBookServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlyBookServerApplication.class, args);
    }
}
