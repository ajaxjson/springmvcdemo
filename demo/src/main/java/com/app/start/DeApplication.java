package com.app.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.service.PersonService;
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan({"com.controller","com.model.entities","com.respo","com.app.start"})
@SpringBootApplication
public class DeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeApplication.class, args);
		//PersonService ps = new PersonService();
//		String personlist = ps.getPersonList();
//		System.out.print(personlist);
	}
	
	

}
