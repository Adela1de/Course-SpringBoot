package com.courseSpringBoot.demo.resources;

import com.courseSpringBoot.demo.DTO.CategoryDTO;
import com.courseSpringBoot.demo.mapper.CategoryMapper;
import com.courseSpringBoot.demo.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/categories")
public class CategoryResource {

    private final CategoryService categoryService;

    @GetMapping
    private ResponseEntity<Iterable<CategoryDTO>> findAll()
    {
        var categories = categoryService.findAll();
        var categoriesDTO =
                categories.
                stream().
                map(CategoryMapper.INSTANCE::toCategoryDTO).
                collect(Collectors.toList());
        return ResponseEntity.ok(categoriesDTO);
    }

    @GetMapping(path = "/{id}")
    private ResponseEntity<CategoryDTO> findById(@PathVariable Long id)
    {
        var categoryDTO = CategoryMapper.INSTANCE.toCategoryDTO(categoryService.findById(id));
        return ResponseEntity.ok(categoryDTO);
    }

}
