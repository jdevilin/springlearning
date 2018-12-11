package com.org.service;

public class BaseBallCoach implements Coach {
	
	// define a private filed for dependency
       private FortuneService fortunService;
       
    // define a constructor for dependency injection
       public BaseBallCoach(FortuneService fortunService) {
    	   this.fortunService = fortunService;
       }
       
	 
	public String getDailyWorkout() {
		return "Spent 30 minutes on batting pratice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortunService.getFortune();
	}

}
