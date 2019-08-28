package com.model.entities;
import java.util.Date;
public class Person {
	private String Id;
	private String firstName;
	private String lastName;
	
	private String email;
	
	private Date birthdate; 
	private String city;
	private String postcode;
	
	private double salary;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	 
	 public String getFirstName() {
	  return firstName;
	 }
	 public void setFirstName(String firstName) {
	  this.firstName = firstName;
	 }
	 public String getLastName() {
	  return lastName;
	 }
	 public void setLastName(String lastName) {
	  this.lastName = lastName;
	 }
	 public String getEmail() {
	  return email;
	 }
	 public void setEmail(String email) {
	  this.email = email;
	 }
	 
	 public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Person() {
		  
	 }
	 public Person(String Id, String firstName, String lastName, String email, String city, String postcode,Date birthdate, Double salary) 
	 {
		 this.Id = Id;
		  this.firstName = firstName;
		  this.lastName = lastName;
		  
		  this.email = email;
		  this.city = city;
		  this.postcode= postcode;
		  this.birthdate = birthdate;
		  this.salary = salary;
	 }
}
