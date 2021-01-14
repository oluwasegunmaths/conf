package com.pluralsight.conferencedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan("com.pluralsight.conferencedemo")
//@EnableJpaRepositories("com.pluralsight.conferencedemo.repositories")
//@EntityScan("com.pluralsight.conferencedemo.models")

public class ConferenceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConferenceDemoApplication.class, args);
	}

}
