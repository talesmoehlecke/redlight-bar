package com.redlightbar.service.impl;

import com.redlightbar.model.AbstractOrder;
import com.redlightbar.model.Customer;
import com.redlightbar.repository.CustomerRepository;
import com.redlightbar.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DefaultCustomerService implements CustomerService {

	private CustomerRepository customerRepository;

	@Autowired
	public DefaultCustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
}
