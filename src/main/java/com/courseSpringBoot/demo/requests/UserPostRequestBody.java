package com.courseSpringBoot.demo.requests;

import lombok.*;

@Getter
@Setter
public class UserPostRequestBody {

    private String name;
    private String email;
    private String phone;
    private String password;
}
