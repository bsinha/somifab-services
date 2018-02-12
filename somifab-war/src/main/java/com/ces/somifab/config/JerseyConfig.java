/*
 * Copyright@ CES. 2015 
 */
package com.ces.somifab.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.somifab.resource.GreetingResource;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() {
		register(GreetingResource.class);
	}

}
