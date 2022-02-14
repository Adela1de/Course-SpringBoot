package com.courseSpringBoot.demo.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPutRequestBody {

    private long id;
    private String name;
    private String email;
    private String phone;
    private String password;
}
