package com.controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonObject;
import com.model.entities.User;

@Controller
public class DataTableController {


    @RequestMapping(value = "/showDataTable", method = RequestMethod.GET)
    public String showdataTable(Model model) throws Exception{
        
        //model.addAttribute("Users", userList);
        return "testdataTable";
    }
    
    
    @RequestMapping(value = "/showDatafromArray", method = RequestMethod.GET)
    public String showDatafromArray(Model model) throws Exception{
        
        //model.addAttribute("Users", userList);
        return "dataTablefromArray";
    }
    

//    
//    @RequestMapping(value = "/showDatafromServerSide", method = RequestMethod.GET)
//    public String showDatafromserverside(Model model) throws Exception{
//        List<User> users = getListOfUsers();
//        UserListContainer userList = new UserListContainer();
//        userList.setUsers(users);
//        model.addAttribute("Users", userList);
//        return "dataTableServerSideData";
//    }
//    

    @RequestMapping(value = "/showDatafromServerSide", method = RequestMethod.GET)
    public  ModelAndView showDatafromServerSide() throws Exception
    {
    	
    	
    	
    		//step1 load the driver class  
    			Class.forName("oracle.jdbc.driver.OracleDriver");  
    			  
    			//step2 create  the connection object  
    			//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-02RCN7L:1522/XE","system","55555"); 
    			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@dbcondev2.aycap.bayad.co.th:1588/aycapd"," ibb_app_uat5"," ibb_app_uat5_11g");
    			Statement stmt=con.createStatement(); 
    			ResultSet rs=stmt.executeQuery("select * from TEST_EMP"); 
    		   
    			
    			

    			JsonObject persons = new JsonObject();

    			
    			
    			
    			while(rs.next()) {
    				JsonObject person = new JsonObject();
    				person.addProperty("firstName", rs.getString(1));
    				person.addProperty("lastName",  rs.getString(2));
    				person.addProperty("email", rs.getString(3));
    				persons.add("data",person);
    			}
    			
    			
    			
    			ModelAndView mv = new ModelAndView();
    			mv.addObject("data", persons);
    			mv.setViewName("dataTableServerSideData");
    			
    			return mv;
    			
    			//System.out.println(persons.toString()); 
		    	
		    	   
		    		
    	
	
	}
    
    
}
