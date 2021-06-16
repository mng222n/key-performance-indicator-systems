package com.ibsv.capitakpi.employee.dao;

import java.util.List;

import com.ibsv.capitakpi.employee.model.Employee;
 
public interface EmloyeeDAO{
	
	void addEmployee(Employee employee);
	
	List<Employee> listEmployee();
	
}