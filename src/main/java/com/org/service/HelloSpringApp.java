package com.org.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load Spring Confiuration File
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Retrive bean from spring Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		//Call method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		// let's call new method of fortune
		
		System.out.println(theCoach.getDailyFortune());
		// Close the context
        context.close();
	}

}
