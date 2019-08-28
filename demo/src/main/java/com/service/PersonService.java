package com.service;
import java.sql.*;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.google.gson.Gson;
import com.model.entities.Person;

public class PersonService {
	
	public String getPersonList()
	{
		List<Person> persons = new ArrayList<Person>();
		
		try{  
			
			//step1 load the driver class  
				Class.forName("oracle.jdbc.driver.OracleDriver");  
				  //test
				//step2 create  the connection object  
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-02RCN7L:1522/XE","system","55555"); 
				//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@dbcondev2.aycap.bayad.co.th:1588/aycapd"," ibb_app_uat5"," ibb_app_uat5_11g");
				
				Statement stmt=con.createStatement();  
				  
				//step4 execute query  
				ResultSet rs=stmt.executeQuery("SELECT  ID, firstName,  lastName,  email,  city,  postcode, birthdate,  salary FROM test_person");  
				while(rs.next()) {
					 //List<Person> person = new ArrayList<Person>();
					 persons.add(new Person(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getDate(7),rs.getDouble(8)));
					 System.out.println(persons.toString());
				}
				
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("data", persons);
				map.put("recordsFiltered", 5);
				map.put("recordsTotal", 7);
				
				Gson gson = new Gson();
				String data = gson.toJson(map);
				// convert to json list
				
				//String
				//System.out.print(data);
				return data;
				
		}catch(Exception e){ 
			//System.out.println(e);
			return null;  
		}
		
		
	}
}
