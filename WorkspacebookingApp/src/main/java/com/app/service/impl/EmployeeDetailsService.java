package com.app.service.impl;

import com.app.entities.Employee;

public interface EmployeeDetailsService {
	
	public Employee saveEmployee(Employee employee);
	
	public Iterable<Employee> findAllEmployees();
	
	public Employee findEmpById(Long empId);
	
	public void DeleteEmpById(Long empId);

}
