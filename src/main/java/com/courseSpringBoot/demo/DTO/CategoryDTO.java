package com.courseSpringBoot.demo.DTO;

import com.courseSpringBoot.demo.entities.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CategoryDTO {

    private Long id;
    private String name;
    @JsonIgnore
    private List<Product> products;

}
