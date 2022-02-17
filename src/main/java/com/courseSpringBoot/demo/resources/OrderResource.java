package com.courseSpringBoot.demo.resources;

import com.courseSpringBoot.demo.entities.Order;
import com.courseSpringBoot.demo.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/orders")
public class OrderResource {

    private final OrderService orderService;

    @GetMapping
    public ResponseEntity<Iterable<Order>> findAll()
    {
        return ResponseEntity.ok(orderService.findAll());
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Order> findById(@PathVariable long id)
    {
        return ResponseEntity.ok(orderService.findByIdOrElseThrowBadRequestException(id));
    }

}
