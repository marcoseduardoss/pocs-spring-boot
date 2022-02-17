package com.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class MainWeblogicApp extends SpringBootServletInitializer implements WebApplicationInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MainWeblogicApp.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MainWeblogicApp.class, args);
	}
	
}
