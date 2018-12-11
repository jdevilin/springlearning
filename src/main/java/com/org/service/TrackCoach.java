package com.org.service;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
		public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run hard 5 k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It : "+fortuneService.getFortune();
	}
	
	// Add Init Method
	
	public void doMyStartUpStaff() {
		System.out.println("TrackCoach : Inside my doMyStartUpStaff");
	}
	
	// Add An Destory Method
    
	public void doMyClaenUpStaff() {
		System.out.println("TrackCoach : Inside my doMyClaenUpStaff");
	}
	

}
