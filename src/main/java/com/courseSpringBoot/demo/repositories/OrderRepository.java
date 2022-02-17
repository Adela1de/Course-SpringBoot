package com.courseSpringBoot.demo.repositories;

import com.courseSpringBoot.demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
