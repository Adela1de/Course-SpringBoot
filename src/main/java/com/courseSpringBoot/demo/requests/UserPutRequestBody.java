package com.courseSpringBoot.demo.requests;

import lombok.*;

@Getter
@Setter
public class UserPutRequestBody {

    private long id;
    private String name;
    private String email;
    private String phone;
    private String password;
}
