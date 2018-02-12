package com.ces.somifab.config;

import org.somifab.resource.config.ResourceConfig;
import org.somifab.service.config.ServiceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ResourceConfig.class, ServiceConfig.class})
public class ApplicationConfig {

}
