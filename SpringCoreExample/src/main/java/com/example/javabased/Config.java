package com.example.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {
	@Bean(name="r1")
	@Primary
	public Resource getResource1() {
		Resource r1 = new Resource();
		r1.setResourceName("Oracle");
		r1.setResourcePort(8080);
		return r1;
	}
	
	@Bean(name="r2")
	public Resource getResource2() {
		Resource r1 = new Resource();
		r1.setResourceName("Mysql");
		r1.setResourcePort(8081);
		return r1;
	}
}