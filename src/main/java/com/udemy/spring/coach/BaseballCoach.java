package com.udemy.spring.coach;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyFortune() {
        return null;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins on batting practice";
    }
}