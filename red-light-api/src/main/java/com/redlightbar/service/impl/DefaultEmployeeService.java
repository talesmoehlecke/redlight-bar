package com.redlightbar.service.impl;

import com.redlightbar.model.Employee;
import com.redlightbar.repository.EmployeeRepository;
import com.redlightbar.service.EmployeeService;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class DefaultEmployeeService implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public DefaultEmployeeService(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
