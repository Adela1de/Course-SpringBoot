package com.courseSpringBoot.demo.mapper;

import com.courseSpringBoot.demo.DTO.CategoryDTO;
import com.courseSpringBoot.demo.entities.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class CategoryMapper {

    public static final CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    public abstract CategoryDTO toCategoryDTO(Category category);
}
