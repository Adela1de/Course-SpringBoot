package com.courseSpringBoot.demo.services;

import com.courseSpringBoot.demo.entities.OrderItem;
import com.courseSpringBoot.demo.repositories.OrderItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderItemService {

    private final OrderItemRepository orderItemRepository;

    public List<OrderItem> findAll()
    {
        return orderItemRepository.findAll();
    }

//    public OrderItem findByIdOrElseThrowBadRequestException(Long id)
//    {
//        return orderItemRepository.
//                findById(id).orElseThrow(
//                        () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "OrderItem not found!")
//                );
//    }
}
