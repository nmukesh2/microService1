package com.example.microserviceone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

	
	@GetMapping("/")
	public String getDetails() {
		return "ab to chal ja yaar";
	}
}
