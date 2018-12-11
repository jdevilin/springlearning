package com.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("myNewFortune")
    private FortuneNewService fortuneService;
       
    /*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
    
   /* @Autowired
    public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
    
   /* @Autowired
    public void doSomeCodeStuff(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practise in BackHand Walley";
	}

	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
