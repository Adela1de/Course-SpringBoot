package com.courseSpringBoot.demo.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgURL;

}