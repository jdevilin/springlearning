package com.org.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAutowiredScope {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationautoContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
