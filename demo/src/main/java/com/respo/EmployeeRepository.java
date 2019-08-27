package com.respo;

import java.util.Map;

import org.hibernate.mapping.Collection;

import com.model.entities.Employee;

import java.util.HashMap;


import org.springframework.stereotype.Repository;


public class EmployeeRepository {
//	private Map<Integer, Employee> repository;
//
//	public EmployeeRepository() {
//		this.repository = new HashMap<>();
//	}
//
//	//@Override
//	public void store(Employee emp) {
//		repository.put(emp.getId(), emp);
//	}
//
//	//@Override
//	public Employee retrieve(int id) {
//		return repository.get(id);
//	}
//
//	//@Override
//	public Employee search(String name) {
//		Collection<Employee> emps = repository.values();
//		for (Employee emp : emps) {
//			if (emp.getName().equalsIgnoreCase(name))
//				return emp;
//		}
//		return null;
//	}
//
//	//@Override
//	public Employee delete(int id) {
//		Employee e = repository.get(id);
//		this.repository.remove(id);
//		return e;
//	}
}
