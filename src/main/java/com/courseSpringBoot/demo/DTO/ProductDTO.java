package com.courseSpringBoot.demo.DTO;

import com.courseSpringBoot.demo.entities.Category;
import com.courseSpringBoot.demo.entities.Order;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgURL;
    private List<Category> categories;
    @JsonIgnore
    private List<Order> orders;

}
