package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PropertiesConnectController {
	@RequestMapping("/")
	  @ResponseBody
	  public String index() {
	    return "Proudly handcrafted by " +
	        "<a href='http://netgloo.com/en'>Netgloo</a> :)";
	  }
}
