package com.courseSpringBoot.demo.services;

import com.courseSpringBoot.demo.repositories.OrderRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;



}
