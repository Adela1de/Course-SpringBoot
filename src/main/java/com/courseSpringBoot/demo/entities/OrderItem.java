package com.courseSpringBoot.demo.entities;

import com.courseSpringBoot.demo.entities.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();
    @Getter
    @Setter
    @EqualsAndHashCode.Exclude
    private Integer quantity;
    @Getter
    @Setter
    @EqualsAndHashCode.Exclude
    private Double price;

    public OrderItem(Order order, Product product, Integer quantity, Double price)
    {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    public OrderItemPK getId() { return id; }

    public Order getOrder()
    {
        return id.getOrder();
    }

    public void setOrder(Order order)
    {
        id.setOrder(order);
    }

    @JsonIgnore
    public Product getProduct()
    {
        return id.getProduct();
    }

    public void setProduct(Product product)
    {
        id.setProduct(product);
    }

}
