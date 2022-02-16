package com.me.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String hello() {
		List<String> list = new ArrayList<String>();
		
		for (int i = 0; i < 100000; i++) {
			list.add("Test-"+1);
		}
		
		System.out.println(list);
		
		return "Hello - teste!";
	}

}