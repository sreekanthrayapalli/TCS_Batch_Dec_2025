package com.example.componetpropertyfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
			
			Resource2 res = context.getBean(Resource2.class);
			res.display();
	}
}
