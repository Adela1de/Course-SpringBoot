package com.courseSpringBoot.demo.mapper;

import com.courseSpringBoot.demo.DTO.OrderDTO;
import com.courseSpringBoot.demo.entities.Order;
import org.mapstruct.factory.Mappers;

public abstract class OrderMapper {

    private static final OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    public abstract OrderDTO toOrderDTO(Order order);
}
