package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.utilities.Alien;


@Controller

public class HomeController {
	
	@RequestMapping("/print1")
	
	public String home1(HttpServletRequest req, HttpServletResponse res)
	{
		HttpSession session =  req.getSession();
		String name = req.getParameter("name");
		System.out.println("hi" + name);
		session.setAttribute("name", name);
		return "home";
	}
	
	@RequestMapping("/print2")
	public String home2(String name, HttpSession session)
	{
		System.out.println("hi" + name);
		session.setAttribute("name", name);
		return "home";
	}
	
	
	@RequestMapping("/print3")
	public ModelAndView home3(@RequestParam("name") String myname)
	{
		//System.out.println("hi" + name);
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myname);
		mv.setViewName("home");
		return mv;
	}
	
//	@RequestMapping("/print4")
//	public ModelAndView home4(Alien alien)
//	{
//		//System.out.println("hi" + name);
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("obj", alien);
//		mv.setViewName("home");
//		return mv;
//	
//	}
	
	
	@RequestMapping("/jpah2")
	public ModelAndView jpah2()
	{
		
		ModelAndView mv = new ModelAndView();
	
		mv.setViewName("jpah2");
		return mv;
	
	}
	
	@RequestMapping("/jpajdbc")
	public ModelAndView jpajdbc()
	{
		
		ModelAndView mv = new ModelAndView();
	
		mv.setViewName("jpajdbc");
		return mv;
	
	}
}
