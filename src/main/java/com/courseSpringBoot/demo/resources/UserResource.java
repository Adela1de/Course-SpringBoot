package com.courseSpringBoot.demo.resources;

import com.courseSpringBoot.demo.DTO.UserDTO;
import com.courseSpringBoot.demo.mapper.UserMapper;
import com.courseSpringBoot.demo.requests.UserPostRequestBody;
import com.courseSpringBoot.demo.requests.UserPutRequestBody;
import com.courseSpringBoot.demo.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;


@RestController
@AllArgsConstructor
@RequestMapping(value = "/users")
public class UserResource {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<Iterable<UserDTO>> findAll(){

        var usersDTO = userService
                .findAll()
                .stream()
                .map(UserMapper.INSTANCE::toUserDTO)
                .collect(Collectors.toList());

        return ResponseEntity.ok(usersDTO);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable long id)
    {
        var User = userService.findByIdOrThrowBadRequestException(id);
        var userToDTO = UserMapper.INSTANCE.toUserDTO(User);
        return ResponseEntity.ok(userToDTO);
    }

    @PostMapping
    public ResponseEntity<UserDTO> save(@RequestBody UserPostRequestBody userPostRequestBody){
        var userToBeSaved = UserMapper.INSTANCE.toUser(userPostRequestBody);
        var savedUser = userService.save(userToBeSaved);
        var userDTO = UserMapper.INSTANCE.toUserDTO(savedUser);

        return ResponseEntity.ok(userDTO);
    }

    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody UserPutRequestBody userPutRequestBody)
    {
        var userToBeReplaced = UserMapper.INSTANCE.toUser(userPutRequestBody);
        userService.replace(userToBeReplaced);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable long id)
    {
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
