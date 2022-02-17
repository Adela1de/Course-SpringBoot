package com.courseSpringBoot.demo.DTO;

import com.courseSpringBoot.demo.entities.User;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
public class OrderDTO {

    private Long id;
    private Instant moment;
    private User client;
}
