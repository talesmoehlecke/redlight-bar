package com.redlightbar.controller;

import com.redlightbar.exception.ResourceNotFoundException;
import com.redlightbar.model.OrderSheet;
import com.redlightbar.model.User;
import com.redlightbar.service.OrderSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order-sheets")
public class OrderSheetController {

    private OrderSheetService orderSheetService;

    @Autowired
    public OrderSheetController(OrderSheetService orderSheetService) {
        this.orderSheetService = orderSheetService;
    }

    //poderia ser uma DTO aqui
    @PostMapping
    @RequestMapping("/add")
    public ResponseEntity<OrderSheet> saveOrderSheet(@RequestBody OrderSheet orderSheet){
        var savedOrderSheet = orderSheetService.saveOrderSheet(orderSheet);
        return new ResponseEntity<>(savedOrderSheet, HttpStatus.CREATED);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<OrderSheet> findOrderSheetById(@PathVariable("id") long id) {
        OrderSheet orderSheet = orderSheetService.findById(id);

        if (orderSheet == null) throw new ResourceNotFoundException(OrderSheet.class.getName(), "id", id);

        return new ResponseEntity<>(orderSheet, HttpStatus.FOUND);
    }
}
