package com.courseSpringBoot.demo.services;

import com.courseSpringBoot.demo.entities.User;
import com.courseSpringBoot.demo.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll(){ return userRepository.findAll(); }

    public User findByIdOrThrowBadRequestException(long id)
    {
        return userRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "User not found")
        );
    }

    public Iterable<User> saveAll(Iterable<User> users) { return userRepository.saveAll(users); }

    public User save(User user){ return userRepository.save(user); }

    public void replace(User user)
    {
        var entity = userRepository.getById(user.getId());
        updateData(entity, user);
        userRepository.save(entity);
    }

    public void delete(long id) { userRepository.delete(findByIdOrThrowBadRequestException(id)); }

    public void updateData(User entity, User user)
    {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }

}
