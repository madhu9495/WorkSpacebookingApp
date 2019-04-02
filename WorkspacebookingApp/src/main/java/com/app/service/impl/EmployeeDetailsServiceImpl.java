package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.impl.EmployeeRepository;
import com.app.dao.impl.UserInfoRepository;
import com.app.entities.Employee;
import com.app.entities.UserSecInfo;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	UserInfoRepository userInfoRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Iterable<Employee> findAllEmployees() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee findEmpById(Long empId) {
		
		return employeeRepository.findById(empId).get();
	}

	@Override
	public void DeleteEmpById(Long empId) {
		
		UserSecInfo user=userInfoRepository.getUserByEmpId(empId);
		
		if(user!=null) {
			
		userInfoRepository.deleteById(user.getUserName());
			
		}
		else {
			
		employeeRepository.deleteById(empId);
			
		}
		
		
		
	}

}
