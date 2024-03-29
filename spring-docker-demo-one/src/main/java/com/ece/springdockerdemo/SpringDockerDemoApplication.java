package com.ece.springdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerDemoApplication.class, args);
	}
	
	@GetMapping("/data")
	public String welcome() {
		return "welcome to spring boot docker demo";
		
		
	}

}
