package com.c1x.traits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class TraitsApplication {

	public static void main(String[] args) {
		System.out.println("Starting TraitsApplication...");
		SpringApplication.run(TraitsApplication.class, args);
	}

}
