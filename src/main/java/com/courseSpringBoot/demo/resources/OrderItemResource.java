package com.courseSpringBoot.demo.resources;

import com.courseSpringBoot.demo.DTO.OrderItemDTO;
import com.courseSpringBoot.demo.mapper.OrderItemMapper;
import com.courseSpringBoot.demo.services.OrderItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/orderitems")
public class OrderItemResource {

    private final OrderItemService orderItemService;

    @GetMapping
    public ResponseEntity<Iterable<OrderItemDTO>> findAll()
    {
        var orderItems = orderItemService.findAll();
        var orderItemsDTO = orderItems.stream().map(OrderItemMapper.INSTANCE::orderItemDTO).collect(Collectors.toList());
        return ResponseEntity.ok(orderItemsDTO);
    }
}
