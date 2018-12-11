package com.org.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
			
		System.out.println("Memory location for theCoach : "+theCoach.getDailyFortune() );
		System.out.println("Memory location for theCoach : "+theCoach.getDailyWorkout() );
		
		
		
		
	}

}
