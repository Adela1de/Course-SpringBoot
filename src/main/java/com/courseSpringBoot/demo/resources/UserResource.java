package com.courseSpringBoot.demo.resources;

import com.courseSpringBoot.demo.entities.User;
import com.courseSpringBoot.demo.repositories.UserRepository;
import com.courseSpringBoot.demo.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping(value = "/users")
public class UserResource {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<Iterable<User>> findAll(){

        return ResponseEntity.ok(userService.findAll());
    }
}
