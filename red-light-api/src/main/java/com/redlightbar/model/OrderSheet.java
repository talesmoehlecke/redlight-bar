package com.redlightbar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

//AKA Comanda
@Entity
@Getter
@Setter
public class OrderSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "number", nullable = false)
    private int number;

    @OneToOne
    @JoinColumn(name = "abstractOrder_id")
    private AbstractOrder abstractOrder;


}
