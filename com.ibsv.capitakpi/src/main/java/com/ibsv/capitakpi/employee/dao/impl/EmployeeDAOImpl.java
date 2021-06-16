package com.ibsv.capitakpi.employee.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import com.ibsv.capitakpi.employee.dao.EmloyeeDAO;
import com.ibsv.capitakpi.employee.model.Employee;
 
public class EmployeeDAOImpl implements EmloyeeDAO{
	
	@SessionTarget
	Session session;
	     
	@TransactionTarget
	Transaction transaction;
	
	//add the employee
	public void addEmployee(Employee employee){
		
		session.save(employee);
		
	}
	
	//return all the employees in list
	public List<Employee> listEmployee(){
		
		return session.createQuery("from Employee").list();
		
	}
	
}