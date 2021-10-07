package com.redlightbar.service.impl;

import com.redlightbar.model.Employee;
import com.redlightbar.repository.EmployeeRepository;
import com.redlightbar.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DefaultEmployeeService implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public DefaultEmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
}
