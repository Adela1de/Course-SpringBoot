package com.courseSpringBoot.demo.entities;

import com.courseSpringBoot.demo.entities.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;
    @EqualsAndHashCode.Exclude
    private Integer orderStatus;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "client_id")
    @Getter
    private User client;

    @OneToMany(mappedBy = "id.order")
    @Getter
    @JsonIgnore
    private List<OrderItem> itens = new ArrayList<>();

    public Order(Long id, Instant moment, OrderStatus orderStatus, User client) {
        this.id = id;
        this.moment = moment;
        setOrderStatus(orderStatus);
        this.client = client;
    }

    public OrderStatus getOrderStatus() { return OrderStatus.valueOf(orderStatus); }

    public void setOrderStatus(OrderStatus orderStatus)
    {
        if(orderStatus != null) this.orderStatus = orderStatus.getCode();
    }
}
