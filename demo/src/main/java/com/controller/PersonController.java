package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.entities.Person;
import com.service.PersonService;
import com.utilities.PersonListContainer;
//

@Controller
public class PersonController {
    @RequestMapping(value = "/getPersons", method = RequestMethod.GET)
    public String getUsers(Model model) throws Exception{
    	PersonService pers= new PersonService();
    	
    	//String personList = pers.getPersonList() ;
        
//        model.addAttribute("Persons", personList);
        return "showUsers";
    }
    
    @RequestMapping(value = "/getPersonfrm", method = RequestMethod.GET)
    public String getUsersfrm(Model model) throws Exception{
        List<Person> persons = getListOfPersonList();
        PersonListContainer personList = new PersonListContainer();
        personList.setPersons(persons);
        model.addAttribute("Persons", personList);
        return "showUsersForm";
    }
    
    // Dummy method for adding List of Users
    private List<Person> getListOfPersonList() {
        List<Person> persons = new ArrayList<Person>();
        try{  
        	String date_s = "2011-01-18"; 
        	SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd"); 
        	Date bdate = dt.parse(date_s); 
        	//SimpleDateFormat dt1 = new SimpleDateFormat("yyyyy-mm-dd");
        	
	        persons.add(new Person("9101EA2D6FF103B8E0530A6502724626","AAA","BBB","AAA@gmail.com","Hongkon","80470",bdate,200.00));
	        persons.add(new Person("9101E76A42FD024AE0530A650272816A","CCC","DDD","CCC@gmail.com","Hanoi","50920",bdate,300.00));
	        persons.add(new Person("910222C27E8002A6E0530A6502723281","DDD","FFF","DDD@gmail.com","Japan","70590",bdate,400.00));
	    }catch(Exception e){ 
			//System.out.println(e);
			return null;  
		}
        return persons;
    }
    
}