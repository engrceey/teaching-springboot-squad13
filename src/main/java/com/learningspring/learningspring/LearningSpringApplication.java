package com.learningspring.learningspring;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component

@SpringBootApplication
public class LearningSpringApplication {

	//CRUD - JPA (JPA, Thymeleaf) - Deca Dashboard
	//Git using IntelliJ
	//Tables -- Mappings
	//Structure MVC
	//Discuss Spring/SpringBoot Core Concepts -- Annotations

	//@SpringBootApplication - @ComponentScan (Classes that are annotated with Component, Bean, etc, @EnableAutoConfiguration

	public static void main(String[] args) {

		SpringApplication.run(LearningSpringApplication.class, args);

	}


}
