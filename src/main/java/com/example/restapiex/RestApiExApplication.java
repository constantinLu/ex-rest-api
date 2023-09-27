package com.example.restapiex;

import controller.AddressController;
import controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {UserController.class, AddressController.class})
public class RestApiExApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiExApplication.class, args);
    }

}
