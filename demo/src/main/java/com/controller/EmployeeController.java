package com.controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.validation.Valid;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.entities.Employee;
import com.utilities.EmployeeJsonRespone;
import com.utilities.EmployeeListContainer;

/**
 * @author imssbora
 */
@Controller
public class EmployeeController {

   @GetMapping("/employeefrm")
   public String employeeForm() {
      return "employeeForm";
   }

   @PostMapping(value = "/saveEmployee", produces = { MediaType.APPLICATION_JSON_VALUE })
   @ResponseBody
   public EmployeeJsonRespone saveEmployee(@ModelAttribute @Valid Employee employee,
         BindingResult result) {

      EmployeeJsonRespone respone = new EmployeeJsonRespone();
      
      if(result.hasErrors()){
         
         //Get error message
         Map<String, String> errors = result.getFieldErrors().stream()
               .collect(
                     Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage)
                 );
         
         respone.setValidated(false);
         respone.setErrorMessages(errors);
      }else{
         // Implement business logic to save employee into database
         //..
        
         
         try{  
        	//step1 load the driver class  
        		Class.forName("oracle.jdbc.driver.OracleDriver");  
        		  
        		//step2 create  the connection object  
        		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-02RCN7L:1522/XE","system","55555"); 
        		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@dbcondev2.aycap.bayad.co.th:1588/aycapd"," ibb_app_uat5"," ibb_app_uat5_11g");
        		con.setAutoCommit(false);  
        		CallableStatement stmt=con.prepareCall("{call INSERT_EMP_TEST(?,?,?,?,?)}"); 
        		
        		
        		   
        		//stmt.setInt(1,employee.Id);  
        		stmt.setString(1,employee.firstName);  
        		stmt.setString(2,employee.lastName);  
        		stmt.setString(3,employee.email);  
        		stmt.setString(4,employee.designation);  
        		stmt.setDouble(5,employee.salary);  
        		stmt.executeUpdate();   
        			
        		con.commit();  
        		System.out.println("record successfully saved");  
        		con.close();  
        		  
        		}catch(Exception e){ System.out.println(e);}  		
         
         respone.setValidated(true);
         respone.setEmployee(employee);
      }
      return respone;
   }
   
   
   @RequestMapping(value = "/getEmploy", method = RequestMethod.GET)
   public String getUsers(Model model) throws Exception{
       List<Employee> employ = getListOfEmploys();
       EmployeeListContainer employList = new EmployeeListContainer();
       employList.setEmployees(employ);
       
       model.addAttribute("Employs", employList);
       return "showEmploys";
   }
   
   // Dummy method for adding List of Users
   private List<Employee> getListOfEmploys() {
       List<Employee> employs = new ArrayList<Employee>();
       employs.add(new Employee("Jack", "Reacher", "abc@xyz.com","test1",123.5));
       employs.add(new Employee("Remington", "Steele", "rs@cbd.com","test2",127.5));
       employs.add(new Employee("Jonathan", "Raven", "jr@sn.com","test3",129.5));
       
       return employs;
   }
}
