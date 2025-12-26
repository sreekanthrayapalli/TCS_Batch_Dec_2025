package com.example.componetpropertyfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Resource {
	public Resource() {
		System.out.println("Object has been created");
	}
	@Value("${m.drivername}")
	private String resourceName;
	
	@Value("${m.portNum}")
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
	
	public void init() {
		System.out.println("init method life cycle");
	}
	public void destroyMethod() {
		System.out.println("Server is stopped now");
	}
}
