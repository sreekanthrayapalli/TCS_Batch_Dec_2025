package com.example.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Resource2 implements InitializingBean, DisposableBean{
	private String resourceName;
	private int resourcePort;
	
	public Resource2(String resourceName, int resourcePort) {
		this.resourceName = resourceName;
		this.resourcePort = resourcePort;
	}

	public String getResourceName() {
		return resourceName;
	}
	
	public int getResourcePort() {
		return resourcePort;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Resouce 2 destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Resource2 init method");
	}
	
}
