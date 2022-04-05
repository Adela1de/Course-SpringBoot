package com.courseSpringBoot.demo.DTO;

import com.courseSpringBoot.demo.entities.Order;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private List<Order> orders;
}
