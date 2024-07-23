package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScriptApplication {

	public static void main(String[] args){
		System.out.println("Hello, Spring!");
		SpringApplication.run(ScriptApplication.class, args);
	}

}
