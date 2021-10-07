package com.redlightbar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
public class Order extends AbstractOrder {
    @Column(name = "orderDate")
    private LocalDate orderDate;

    @Column(name = "paymentMethod")
    private String paymentMethod;

}
