package com.example.componetpropertyfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.example.componetpropertyfile")
@PropertySource("myres.properties")
public class Config {
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertyFile() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public Resource getR1() {
		Resource r1 = new Resource();
		r1.setResourceName("lsdkjf");
		r1.setResourcePort(987);
		return r1;
	}
}
