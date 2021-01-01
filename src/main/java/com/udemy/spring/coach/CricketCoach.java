package com.udemy.spring.coach;

import com.udemy.spring.fortuneService.FortuneService;

public class CricketCoach implements Coach {

    FortuneService fortuneService;

    // create private fields
    private String emailAddress;
    private String team;

    //create a no argument constructor
    public CricketCoach() {
        System.out.println("Cricket coach: inside no-arg constructor");
    }

    // our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket coach: inside setFortuneService method");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Email is getting set as :" + emailAddress);
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Team is getting set as :" + team);
        this.team = team;
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