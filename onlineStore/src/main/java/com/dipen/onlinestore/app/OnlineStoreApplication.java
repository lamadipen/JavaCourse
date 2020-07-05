package com.dipen.onlinestore.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OnlineStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineStoreApplication.class, args);
	}

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to online store";
	}

	@GetMapping("/welcome/{username}/{age}")
	public String welcomeWithUser(@PathVariable String username, @PathVariable int age){
		return "Welcome to online store: " + username + "with age " + age;
	}

	@GetMapping("/hello")
	public String helloWithQueryParameter(@RequestParam String username, @RequestParam(name = "userage") int age){
		return "Hello : " + username + "with age " + age;
	}
}
