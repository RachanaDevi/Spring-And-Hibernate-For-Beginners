package com.udemy.spring.coach;

import com.udemy.spring.fortuneService.FortuneService;

public class CricketCoach implements Coach {

    FortuneService fortuneService;

    //create a no argument constructor
    public CricketCoach() {
        System.out.println("Cricket coach: inside no-arg constructor");
    }

    // our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket coach: inside setFortuneService method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}