package com.courseSpringBoot.demo.DTO;

import com.courseSpringBoot.demo.entities.pk.OrderItemPK;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemDTO {

    private OrderItemPK id;
    private Integer quantity;
    private Double price;
}
