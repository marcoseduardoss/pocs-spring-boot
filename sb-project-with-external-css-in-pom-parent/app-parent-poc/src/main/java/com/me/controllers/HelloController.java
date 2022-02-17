package com.me.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/ping")
	public String ping() {
		System.out.println("...ping!");		
		return "...Ping !";
	}

}