package com.courseSpringBoot.demo.services;

import com.courseSpringBoot.demo.entities.User;
import com.courseSpringBoot.demo.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public Iterable<User> findAll(){ return userRepository.findAll(); }

    public Iterable<User> saveAll(Iterable<User> users) { return userRepository.saveAll(users); }

    public User save(User user){ return userRepository.save(user); }
}
