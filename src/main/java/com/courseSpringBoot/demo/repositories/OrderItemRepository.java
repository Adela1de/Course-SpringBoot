package com.courseSpringBoot.demo.repositories;

import com.courseSpringBoot.demo.entities.OrderItem;
import com.courseSpringBoot.demo.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
