package com.ibsv.capitakpi.employee.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ibsv.capitakpi.employee.dao.EmloyeeDAO;
import com.ibsv.capitakpi.employee.dao.impl.EmployeeDAOImpl;
import com.ibsv.capitakpi.employee.model.Employee;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
 
public class EmployeeAction extends ActionSupport 
	implements ModelDriven{

	Employee employee = new Employee();
	List<Employee> employeeList = new ArrayList<Employee>();
	EmloyeeDAO employeeDAO = new EmployeeDAOImpl();
	
	public String execute() throws Exception {
		return SUCCESS;
	}

	public Object getModel() {
		return employee;
	}
	
	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	//save employee
	public String addEmployee() throws Exception{
		
		//save it
		employee.setStartDate(new Date());
		employeeDAO.addEmployee(employee);
	 
		//reload the employee list
		employeeList = null;
		employeeList = employeeDAO.listEmployee();
		
		return SUCCESS;
	
	}
	
	//list all employees
	public String listEmployee() throws Exception{
		
		employeeList = employeeDAO.listEmployee();
		
		return SUCCESS;
	
	}
	
}