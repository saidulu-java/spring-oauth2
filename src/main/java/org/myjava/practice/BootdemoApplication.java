package org.myjava.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootdemoApplication {

	public static void main(String[] args) {
		System.out.println("Boot is starting *******");
		SpringApplication.run(BootdemoApplication.class, args);
		System.out.println("Boot is Started *****");
	}
}
