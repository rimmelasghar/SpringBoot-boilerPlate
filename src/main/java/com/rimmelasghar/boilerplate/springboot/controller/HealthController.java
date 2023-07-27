package com.rimmelasghar.boilerplate.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// rimmel asghar
@RestController
public class HelloController {

	@GetMapping("/health")
	public ResponseEntity<String> sayHello() {

		return ResponseEntity.ok("Working Hot as Chili Sauce - developed by Rimmel");
	}

}
