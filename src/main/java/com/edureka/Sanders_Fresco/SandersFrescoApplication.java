package com.edureka.Sanders_Fresco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SandersFrescoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SandersFrescoApplication.class, args);
	}
    
	@GetMapping("/")
	    public String hello() {
	      return String.format("<h1>Hello There, Welcome to Sanders and Fresco Pvt Ltd!</h1>");
	    }
}
