package com.rimmelasghar.application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() {

		return ResponseEntity.ok("Hello Spring Boot Boilerplate");
	}

}
