package com.learning.azurelearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureLearnApplication {
    @GetMapping("/message")
    public String message() {
        return "Congrats , Your app is deployed in azure";
    }

    public static void main(String[] args) {
        SpringApplication.run(AzureLearnApplication.class, args);
    }

}
