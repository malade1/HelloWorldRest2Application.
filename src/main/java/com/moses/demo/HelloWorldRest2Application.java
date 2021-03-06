package com.moses.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldRest2Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldRest2Application.class, args);
	}

	@RequestMapping("/greet")
	public String helloGreeting() {
		
		return "Hello REST -1";
	}
}
