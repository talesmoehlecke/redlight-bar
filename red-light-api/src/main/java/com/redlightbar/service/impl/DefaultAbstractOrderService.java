package com.redlightbar.service.impl;

import com.redlightbar.model.AbstractOrder;
import com.redlightbar.model.User;
import com.redlightbar.repository.AbstractOrderRepository;
import com.redlightbar.service.AbstractOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DefaultAbstractOrderService implements AbstractOrderService {

	private AbstractOrderRepository abstractOrderRepository;

	@Autowired
	public DefaultAbstractOrderService(AbstractOrderRepository abstractOrderRepository) {
		this.abstractOrderRepository = abstractOrderRepository;
	}

	@Override
	public AbstractOrder saveAbstractOrder(AbstractOrder abstractOrder) {
		return abstractOrderRepository.save(abstractOrder);
	}
}
