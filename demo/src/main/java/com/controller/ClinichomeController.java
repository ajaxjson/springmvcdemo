package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class ClinichomeController {
	 @RequestMapping("/")
	    String home() {
	        return "index";
	    }


	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(ClinichomeController.class, args);
	    }
}
