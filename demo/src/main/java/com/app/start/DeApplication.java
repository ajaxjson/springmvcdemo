package com.app.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan({"com.controller","com.model.entities","com.respo","com.app.start"})
@SpringBootApplication
public class DeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeApplication.class, args);
	}

}
