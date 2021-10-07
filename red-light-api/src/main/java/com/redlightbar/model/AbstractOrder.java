package com.redlightbar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
public class AbstractOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy="abstractOrder")
    private Set<Entry> entries;

    @ManyToOne
    @JoinColumn(
            name = "customerId")
    private Customer customer;

    @Column(name = "subTotal")
    private Double subTotal;

}
