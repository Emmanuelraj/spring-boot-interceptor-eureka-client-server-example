/**
 * 
 */
package com.springbootmicroservicesexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Emmanuel Raj
 * purpose: handles the request Mapping method
 */
@RestController
@RequestMapping("/greet")
public class GreetController 
{
	
	@GetMapping("/hi")
	public String hi()
	{
		return "hi";
	}

}
