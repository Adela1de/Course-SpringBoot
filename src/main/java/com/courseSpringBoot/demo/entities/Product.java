package com.courseSpringBoot.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "tb_product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String description;
    @Getter
    @Setter
    private Double price;
    @Getter
    @Setter
    @EqualsAndHashCode.Exclude
    private String imgURL;
    @ManyToMany
    @JoinTable(name = "tb_product_category",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    @Getter
    private List<Category> categories = new ArrayList<>();

    @OneToMany(mappedBy = "id.product")
    private List<OrderItem> itens = new ArrayList<>();

    public Product(Long id, String name, String description, Double price, String imgURL) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgURL = imgURL;
    }

    @JsonIgnore
    public List<Order> getOrders()
    {
        List<Order> order = new ArrayList<>();
        for(OrderItem x : itens)
        {
            order.add(x.getOrder());
        }
        return order;
    }

}
