package com.example.demo;

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
	
	public void init() {
		System.out.println("init method life cycle");
	}
	public void destroyMethod() {
		System.out.println("Server is stopped now");
	}
}
