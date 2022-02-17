package com.courseSpringBoot.demo.DTO;

import com.courseSpringBoot.demo.entities.Order;
import lombok.*;

import java.util.List;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private List<Order> orders;
}
