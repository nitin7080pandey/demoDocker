package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	

	@GetMapping("/message")
	public String getMessage() {
		return "Docker Running Application";
	}

	@GetMapping
	public String greetCall() {
		return "Hello Pandey";
	}
}
