package com.courseSpringBoot.demo.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPostRequestBody {

    private String name;
    private String email;
    private String phone;
    private String password;
}
