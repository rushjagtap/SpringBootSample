package com.ait.spring.pkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(HelloWorld.class, args);
		System.out.println("done...");
	}
}