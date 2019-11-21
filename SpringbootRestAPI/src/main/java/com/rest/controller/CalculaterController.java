package com.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.beans.StandardCal;
import com.rest.beans.StandardCalBean;




@Controller

public class CalculaterController {
 
	@RequestMapping(method = RequestMethod.POST, value = "/STCalulator/{first}/{operator}/{second}")

	 
	@ResponseBody 
		public StandardCalBean RestRespone(@PathVariable ("first") double first, @PathVariable("operator") String operator, @PathVariable("second") double second) {
		System.out.println("testing");
		
		
		return new StandardCal().STCalulator(first, operator, second);
		
		
	
	}	

}
