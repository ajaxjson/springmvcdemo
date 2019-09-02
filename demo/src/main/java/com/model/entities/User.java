package com.model.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
	

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
	private String firstName;

	private String lastName;
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public User() {
		  
	 }
	 public User(long Id, String firstName, String lastName) 
	 {
		 this.id = Id;
		  this.firstName = firstName;
		  this.lastName = lastName;
		  
		 
	 }
	 
    // standard constructors / setters / getters / toString
}
