package com.redlightbar.service.impl;

import com.redlightbar.model.Order;
import com.redlightbar.repository.OrderRepository;
import com.redlightbar.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DefaultOrderService implements OrderService {

	private OrderRepository orderRepository;

	@Autowired
	public DefaultOrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	public Order saveOrder(Order order) {
		return orderRepository.save(order);
	}
}
