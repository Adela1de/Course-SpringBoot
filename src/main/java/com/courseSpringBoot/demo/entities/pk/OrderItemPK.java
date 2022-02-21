package com.courseSpringBoot.demo.entities.pk;

import com.courseSpringBoot.demo.entities.Order;
import com.courseSpringBoot.demo.entities.Product;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class OrderItemPK implements Serializable {

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
