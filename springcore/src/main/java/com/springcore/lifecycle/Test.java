package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lcconfig.xml");
//		Samosa samosa = (Samosa) context.getBean("s1");
//		System.out.println(samosa);
//		
		// registering shutdown hook , used AbstractApplicationContext not ApplicationContext
		context.registerShutdownHook();
//		
//		System.out.println("+++++++++++++++++++++");
//		
//		Pepsi pepsi = (Pepsi) context.getBean("p1");
//		System.out.println(pepsi);
//		
//		System.out.println("+++++++++++++++++++++");
		
		ExampleAnnotation e1 = (ExampleAnnotation) context.getBean("example");
		System.out.println(e1);
	}

}
