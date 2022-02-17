package com.courseSpringBoot.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Long id;
    private Instant moment;

}
