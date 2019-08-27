package com.utilities;

import java.util.List;

import com.model.entities.Employee;


public class EmployeeListContainer {

	 private List<Employee> employ;

	    public List<Employee> getEmployees() {
	        return employ;
	    }

	    public void setEmployees(List<Employee> employees) {
	        this.employ = employees;
	    }
}
