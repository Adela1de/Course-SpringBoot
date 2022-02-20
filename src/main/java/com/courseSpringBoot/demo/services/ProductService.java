package com.courseSpringBoot.demo.services;

import com.courseSpringBoot.demo.entities.Product;
import com.courseSpringBoot.demo.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> findAll()
    {
        return productRepository.findAll();
    }

    public Product findByIdOrElseThrowBadRequestException(Long id)
    {
        return productRepository.findById(id).orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Product not found!")
                );
    }
}
