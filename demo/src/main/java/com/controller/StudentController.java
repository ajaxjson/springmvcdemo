package com.controller;

import java.io.IOException;




import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



import com.model.entities.Student;

@Controller
public class StudentController {
    
  @RequestMapping("/regisfrm")
  public ModelAndView frmregist() {
  		ModelAndView mv = new ModelAndView();
  		mv.setViewName("register_form");
  		return mv;
      //@PathVariable("id") Long Id, Model model
  }
  
 

  @RequestMapping("/getjson")
  public @ResponseBody ModelAndView getjson(@RequestBody String json) throws JsonParseException, JsonMappingException, IOException 
  {
	  ObjectMapper mapper=new ObjectMapper();

	  Student obj=mapper.readValue(json,Student.class);
	  
	  System.out.print(obj);
	  //return “success”;
  
  		ModelAndView mv = new ModelAndView();
  		mv.setViewName("register_form");

  		mv.addObject("showjsondata",obj);
  		return mv;
      
  }
  
	
	
}
