package com.tanmay.carbjunkies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CarbjunkiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarbjunkiesApplication.class, args);
	}

}
