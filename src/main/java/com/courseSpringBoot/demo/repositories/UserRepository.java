package com.courseSpringBoot.demo.repositories;

import com.courseSpringBoot.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
