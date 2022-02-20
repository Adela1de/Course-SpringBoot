package com.courseSpringBoot.demo.mapper;

import com.courseSpringBoot.demo.DTO.ProductDTO;
import com.courseSpringBoot.demo.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class ProductMapper {

    public static final ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    public abstract ProductDTO toProductDTO(Product product);
}
