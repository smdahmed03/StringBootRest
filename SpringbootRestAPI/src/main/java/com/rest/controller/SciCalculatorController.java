package com.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.beans.StandardCal;
import com.rest.beans.StandardCalBean;

@Controller
public class SciCalculatorController {
	
	@RequestMapping(method = RequestMethod.POST, value = "/SciCalulator/{first}/{operator}")

	 
	@ResponseBody 
		public StandardCalBean RestResponeSci(@PathVariable ("first") double first, @PathVariable("operator") String operator) {
		System.out.println("testing");
		
		
		return new StandardCal().SciCalulator(first, operator);
		
		
	
	}	


}
