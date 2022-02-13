package com.courseSpringBoot.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;


}
