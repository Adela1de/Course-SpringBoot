package com.courseSpringBoot.demo.DTO;

import com.courseSpringBoot.demo.entities.OrderItem;
import com.courseSpringBoot.demo.entities.User;
import com.courseSpringBoot.demo.entities.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
public class OrderDTO {

    private Long id;
    private Instant moment;
    private OrderStatus orderStatus;
    @JsonIgnore
    private User client;
    private List<OrderItem> itens;
}
