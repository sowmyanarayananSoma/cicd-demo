package com.trios.cicddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicddemoApplication.class, args);
	}

	@GetMapping("/welcome")
	public String Welcome(){
		return  "Welcome to this exciting world !";
	}

}
