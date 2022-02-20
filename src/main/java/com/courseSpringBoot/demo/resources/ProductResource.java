package com.courseSpringBoot.demo.resources;

import com.courseSpringBoot.demo.DTO.ProductDTO;
import com.courseSpringBoot.demo.mapper.ProductMapper;
import com.courseSpringBoot.demo.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/products")
public class ProductResource {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<Iterable<ProductDTO>> findAll()
    {
        var products = productService.findAll();
        var productsDTO =
                products
                .stream()
                .map(ProductMapper.INSTANCE::toProductDTO)
                .collect(Collectors.toList());

        return ResponseEntity.ok(productsDTO);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable long id)
    {
        var product = productService.findByIdOrElseThrowBadRequestException(id);
        var productDTO = ProductMapper.INSTANCE.toProductDTO(product);
        return ResponseEntity.ok(productDTO);
    }

}
