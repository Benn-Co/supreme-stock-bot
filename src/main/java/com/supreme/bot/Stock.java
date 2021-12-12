package com.supreme.bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    String home() {
        
        new Ai.predictStocks();

        return new Ai.predictStocks(); 
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}