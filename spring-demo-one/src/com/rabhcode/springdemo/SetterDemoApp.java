package com.rabhcode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve method on the bean
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//call our new methods to get the literals value
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		//close the context on bean
        context.close();
	}

}
