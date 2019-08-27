package com.model.entities;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("deprecation")
public class Employee {

   @NotEmpty(message="Enter first name.")
   public String firstName;

   @NotEmpty(message="Enter last name.")
   public String lastName;

   @Email(message="Enter a valid email.")
   public String email;

   @NotEmpty(message="Enter your designation.")
   public String designation;

   public double salary;
   
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

   public String getDesignation() {
      return designation;
   }

   public void setDesignation(String designation) {
      this.designation = designation;
   }
   

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }
   
   public Employee() {
	   
   }
   
   public Employee(String firstName, String lastName, String email,String destination,double salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.salary = salary;
    this.designation = destination;
   }
   
}

