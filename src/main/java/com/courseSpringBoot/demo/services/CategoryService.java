package com.courseSpringBoot.demo.services;

import com.courseSpringBoot.demo.entities.Category;
import com.courseSpringBoot.demo.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> findAll(){ return categoryRepository.findAll(); }

    public Category findById(Long id)
    {
        return categoryRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Category not found!")
        );
    }

}
