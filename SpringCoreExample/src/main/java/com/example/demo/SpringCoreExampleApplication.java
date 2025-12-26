package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sample.xml");
		Resource r1 = context.getBean(Resource.class);
		System.out.println(r1.getResourceName());
		
		Resource2 r2= (Resource2)context.getBean("s2");
		System.out.println(r2.getResourceName());
		
		
		Resource r3 = context.getBean(Resource.class);
		System.out.println(r3.getResourceName());
		
		((ClassPathXmlApplicationContext)context).close();
	
	}

}


