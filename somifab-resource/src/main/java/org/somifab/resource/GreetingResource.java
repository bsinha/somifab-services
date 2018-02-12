/*
 * Copyright@ CES. 2015 
 */
package org.somifab.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.somifab.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/greetings")
public class GreetingResource {
	
	private GreetingService greetingService;

	@Autowired
	public GreetingResource(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	@GET
	public String message() {
		return "Hello " + this.greetingService.getMessage();
	}
	

}
