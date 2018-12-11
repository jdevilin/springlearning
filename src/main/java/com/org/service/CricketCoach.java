package com.org.service;

/**
 * @author saurabh.srivastava
 *
 */
public class CricketCoach implements Coach {
    
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach : inside no-arg constructor");
	}	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside setter method -setFortuneService");
		this.fortuneService = fortuneService;
	}	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside setter method -setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside setter method -setTeam");
		this.team = team;
	}
	
	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Need fast bowl parchice daily in 5 minute";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
