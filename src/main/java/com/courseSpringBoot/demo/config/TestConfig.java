package com.courseSpringBoot.demo.config;

import com.courseSpringBoot.demo.entities.User;
import com.courseSpringBoot.demo.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@AllArgsConstructor
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    private final UserService userService;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");

        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userService.saveAll(Arrays.asList(u1, u2));
    }
}
