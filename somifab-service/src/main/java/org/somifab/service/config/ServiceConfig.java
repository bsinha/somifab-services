package org.somifab.service.config;

import org.somifab.service.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
	
	@Bean
	public GreetingService greetingService() {
		return new GreetingService();
	}

}
