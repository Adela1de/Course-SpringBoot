package com.courseSpringBoot.demo.resources;

import com.courseSpringBoot.demo.entities.User;
import com.courseSpringBoot.demo.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping(value = "/users")
public class UserResource {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<Iterable<User>> findAll(){ return ResponseEntity.ok(userService.findAll()); }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user){ return ResponseEntity.ok(userService.save(user)); }
}
