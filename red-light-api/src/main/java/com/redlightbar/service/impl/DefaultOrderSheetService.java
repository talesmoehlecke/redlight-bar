package com.redlightbar.service.impl;

import com.redlightbar.model.OrderSheet;
import com.redlightbar.repository.OrderSheetRepository;
import com.redlightbar.service.OrderSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DefaultOrderSheetService implements OrderSheetService {

	private OrderSheetRepository orderSheetRepository;

	@Autowired
	public DefaultOrderSheetService(OrderSheetRepository orderSheetRepository) {
		this.orderSheetRepository = orderSheetRepository;
	}

	@Override
	public OrderSheet saveOrderSheet(OrderSheet orderSheet) {
		return orderSheetRepository.save(orderSheet);
	}
}
