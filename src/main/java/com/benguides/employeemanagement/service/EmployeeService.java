package com.benguides.employeemanagement.service;

import java.util.List;

import com.benguides.employeemanagement.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	List<Employee> fetchAllEmployees();
	Employee getEmployeeById(Long id);
	Employee updateEmployeeById(Long id, Employee employee);
	String deleteEmployeeById(Long id);
	
	
}
