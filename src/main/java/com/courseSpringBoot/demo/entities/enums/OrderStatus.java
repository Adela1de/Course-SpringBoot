package com.courseSpringBoot.demo.entities.enums;

import lombok.Getter;


public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELLED(5);

    @Getter
    private int code;

    private OrderStatus(int code) { this.code = code; }

    public static OrderStatus valueOf(int code)
    {
        for (OrderStatus value : OrderStatus.values())
        {
            if(value.getCode() == code)
                return value;
        }throw new IllegalArgumentException("Invalid OrderStatus code!");

    }

}
