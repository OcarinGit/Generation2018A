package com.holamundospringboot.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolaMundoApp {
  
	public static void main(String[] args) {
		System.out.println("Holo, This is SpringBoot1");
		SpringApplication.run(HolaMundoApp.class, args);
		System.out.println("Holo, This is SpringBoot2");

	}

}
