package com.infotech.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.infotech.app.controller")
public class HelloWorldSpringBootApp {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSpringBootApp.class, args);
	}
}
