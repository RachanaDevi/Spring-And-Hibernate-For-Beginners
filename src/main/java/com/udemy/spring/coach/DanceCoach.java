package com.udemy.spring.coach;

import com.udemy.spring.fortuneService.FortuneService;

public class DanceCoach implements Coach {

    FortuneService fortuneService;

    public DanceCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Break-dance for 30 mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}