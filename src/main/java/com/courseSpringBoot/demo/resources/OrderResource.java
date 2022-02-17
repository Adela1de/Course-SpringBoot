package com.courseSpringBoot.demo.resources;

import com.courseSpringBoot.demo.services.UserService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrderResource {

    private final UserService userService;


}
