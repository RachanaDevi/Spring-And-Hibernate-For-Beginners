package com.udemy.spring.coach;

import com.udemy.spring.fortuneService.FortuneService;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim for 100ms!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
