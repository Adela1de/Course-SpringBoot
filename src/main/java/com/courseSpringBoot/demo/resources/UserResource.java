package com.courseSpringBoot.demo.resources;

import com.courseSpringBoot.demo.DTO.UserDTO;
import com.courseSpringBoot.demo.entities.User;
import com.courseSpringBoot.demo.mapper.UserMapper;
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
    public ResponseEntity<UserDTO> save(@RequestBody User user){
        var savedUser = userService.save(user);
        var userDTO = UserMapper.INSTANCE.toUserDTO(savedUser);
        return ResponseEntity.ok(userDTO);
    }

}
