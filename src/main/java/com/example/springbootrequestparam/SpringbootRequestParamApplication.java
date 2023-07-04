package com.example.springbootrequestparam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootRequestParamApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRequestParamApplication.class, args);
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(value="name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
