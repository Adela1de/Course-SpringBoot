package com.courseSpringBoot.demo.resources;

import com.courseSpringBoot.demo.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){

        User u = new User(1L, "Luiz", "luiz@luiz", "3104", "2241");
        return ResponseEntity.ok().body(u);
    }
}
