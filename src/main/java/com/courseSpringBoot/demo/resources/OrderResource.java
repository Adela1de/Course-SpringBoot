package com.courseSpringBoot.demo.resources;

import com.courseSpringBoot.demo.DTO.OrderDTO;
import com.courseSpringBoot.demo.entities.Order;
import com.courseSpringBoot.demo.mapper.OrderMapper;
import com.courseSpringBoot.demo.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/orders")
public class OrderResource {

    private final OrderService orderService;

    @GetMapping
    public ResponseEntity<Iterable<OrderDTO>> findAll()
    {
        var orders = orderService.findAll();
        var ordersDTO = orders.stream().map(OrderMapper.INSTANCE::toOrderDTO).collect(Collectors.toList());
        return ResponseEntity.ok(ordersDTO);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<OrderDTO> findById(@PathVariable long id)
    {
        var order = orderService.findByIdOrElseThrowBadRequestException(id);
        var orderDTO = OrderMapper.INSTANCE.toOrderDTO(order);
        return ResponseEntity.ok(orderDTO);
    }

}
