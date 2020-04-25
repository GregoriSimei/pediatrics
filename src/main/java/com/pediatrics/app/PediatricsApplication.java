package com.pediatrics.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.pediatrics.models")
public class PediatricsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PediatricsApplication.class, args);
	}

}
