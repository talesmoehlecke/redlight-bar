package com.redlightbar.service.impl;

import com.redlightbar.model.OrderSheet;
import com.redlightbar.repository.OrderSheetRepository;
import com.redlightbar.service.OrderSheetService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

	@Override
	public OrderSheet findById(long id) {
		return orderSheetRepository.findById(id).orElse(null);
	}
}
