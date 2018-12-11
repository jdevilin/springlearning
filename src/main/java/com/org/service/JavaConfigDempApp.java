package com.org.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDempApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		
		System.out.println("Memory location for theCoach : "+theCoach.getDailyFortune() );
		System.out.println("Memory location for theCoach : "+theCoach.getDailyWorkout() );
	}

}
