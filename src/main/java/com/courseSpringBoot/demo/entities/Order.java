package com.courseSpringBoot.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Data
@AllArgsConstructor
@Entity
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Instant moment;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

}
