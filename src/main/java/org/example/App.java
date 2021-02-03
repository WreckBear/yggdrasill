package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@RestController
@ComponentScan("org.example")
public class App {

    @GetMapping("/hello")
    public String hello(){
        return "SUCCESS";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

}
