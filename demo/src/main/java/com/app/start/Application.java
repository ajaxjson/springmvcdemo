package com.app.start;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

import com.model.entities.User;
import com.respo.UserRepository;

public class Application {
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
 
    @Bean
    public CommandLineRunner run(UserRepository userRepository) throws Exception {
        return (String[] args) -> {
            User user1 = new User(1111, "John", "john@domain.com");
            User user2 = new User(2222, "Julie", "julie@domain.com");
            userRepository.save(user1);
            userRepository.save(user2);
           // userRepository.findAll().forEach(user -> System.out.println(user);
        };
    }
}
