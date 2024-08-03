package com.example.warmindo_bang_dul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WarmindoBangDulApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarmindoBangDulApplication.class, args);
	}

}
