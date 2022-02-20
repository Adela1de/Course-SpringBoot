package com.courseSpringBoot.demo.DTO;

import com.courseSpringBoot.demo.entities.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
public class OrderDTO {

    private Long id;
    private Instant moment;
    @JsonIgnore
    private User client;
}
