package com.courseSpringBoot.demo.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Table(name = "tb_payment")
public class Payment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @EqualsAndHashCode.Exclude
    private Instant moment;

    @OneToOne
    @MapsId
    @EqualsAndHashCode.Exclude
    private Order order;

    public Payment(Long id, Instant moment, Order order)
    {
        this.id = id;
        this.moment = moment;
        this.order = order;
    }
}
