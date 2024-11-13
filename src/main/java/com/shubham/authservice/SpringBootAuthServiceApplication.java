package com.shubham.authservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
    info =
        @Info(
            title = "Authentication Service",
            version = "1.0",
            description = "User Authentication"))
public class SpringBootAuthServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootAuthServiceApplication.class, args);
  }
}
