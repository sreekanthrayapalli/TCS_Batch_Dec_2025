package com.example.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = 
		new AnnotationConfigApplicationContext(Config.class);
		Resource r1 = (Resource)context.getBean("r1");
		
		Resource r2 = (Resource)context.getBean("r2");
		Resource r3 = context.getBean(Resource.class);//here we will Exception if do not
		//specify @Primary   
		//@Primary tells default Bean to spring container
		
		
		System.out.println(r1.getResourceName()+"  "+r2.getResourceName());
	}

}
