package com.udemy.spring.coach;

public class DanceCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Break-dance for 30 mins";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
