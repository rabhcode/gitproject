package com.rabhcode.springdemo;

public class BaseballCoach implements Coach {
	//define a private field for dependency 
	private FortuneService fortuneService;
	
	//define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
}

	@Override
	public String getDailyFortune() {
		// use my fortuneservice to get a fortune 
		return fortuneService.getFortune();
	}
}
