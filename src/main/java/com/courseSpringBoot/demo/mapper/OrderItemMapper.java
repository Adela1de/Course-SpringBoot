package com.courseSpringBoot.demo.mapper;

import com.courseSpringBoot.demo.DTO.OrderItemDTO;
import com.courseSpringBoot.demo.entities.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class OrderItemMapper {

    public static final OrderItemMapper INSTANCE = Mappers.getMapper(OrderItemMapper.class);

    public abstract OrderItemDTO orderItemDTO(OrderItem orderItem);
}
