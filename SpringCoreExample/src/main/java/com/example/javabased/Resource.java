package com.example.javabased;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Resource {
	
	public Resource() {
		System.out.println("Object has been created");
	}

	private String resourceName;
	private int resourcePort;
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public int getResourcePort() {
		return resourcePort;
	}
	public void setResourcePort(int resourcePort) {
		this.resourcePort = resourcePort;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method life cycle");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Server is stopped now");
	}
}
