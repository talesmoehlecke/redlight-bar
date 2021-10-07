package com.redlightbar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(
            name = "productId")
    private Product product;

    @Column(name = "totalPrice")
    private Double totalPrice;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name="abstractOrder", nullable=false)
    private AbstractOrder abstractOrder;
}
