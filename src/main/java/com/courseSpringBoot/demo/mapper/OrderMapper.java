package com.courseSpringBoot.demo.mapper;

import com.courseSpringBoot.demo.DTO.OrderDTO;
import com.courseSpringBoot.demo.entities.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class OrderMapper {

    public static final OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    public abstract OrderDTO toOrderDTO(Order order);

}
