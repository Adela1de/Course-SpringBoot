package com.courseSpringBoot.demo.services;

import com.courseSpringBoot.demo.entities.Order;
import com.courseSpringBoot.demo.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public List<Order> findAll()
    {
        return orderRepository.findAll();
    }

    public Order findByIdOrElseThrowBadRequestException(Long id)
    {
        return orderRepository.
                findById(id).orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Order not found!")
                );
    }
}
