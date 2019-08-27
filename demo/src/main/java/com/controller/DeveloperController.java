package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.entities.DefectSeverityDetails;
import com.model.entities.Developer;

@Controller
@RequestMapping(value = "/ajax")
public class DeveloperController {
	@RequestMapping(value = "/getDefectCount", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody DefectSeverityDetails postEmployeeData(@RequestBody Developer developer) {
 
		// process the developer object
		// Your implementation. For demo I hard-coded the Defect counts
 
		DefectSeverityDetails defectSeverityDetails = new DefectSeverityDetails();
		defectSeverityDetails.setHigh(3);
		defectSeverityDetails.setMedium(2);
		defectSeverityDetails.setLow(8);
 
		return defectSeverityDetails;
	}
 
	@RequestMapping(value = "/developerDefects")
	public String showEmployeePage() {
		return "devfrm";
	}
 
}
