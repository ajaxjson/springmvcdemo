package com.utilities;


import java.sql.*;
import java.util.Arrays;

import com.google.gson.JsonObject;



public class TestArrayJson {
	

	public  static void main(String args[])
	{  

		  
		try{  
		//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-02RCN7L:1522/XE","system","55555"); 
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@dbcondev2.aycap.bayad.co.th:1588/aycapd"," ibb_app_uat5"," ibb_app_uat5_11g");
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("select * from TEST_EMP"); 
		   
			
			

			JsonObject personss = new JsonObject();

			
			
			
			while(rs.next()) {
				JsonObject personx = new JsonObject();
				personx.addProperty("firstName", rs.getString(1));
				personx.addProperty("lastName",  rs.getString(2));
				personx.addProperty("email", rs.getString(3));
				personss.add("data",personx);
			}
			System.out.println(personss.toString()); 
	}catch(Exception e){ System.out.println(e);}  
	   
	}		
}
