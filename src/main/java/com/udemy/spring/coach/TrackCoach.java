package com.udemy.spring.coach;

import com.udemy.spring.fortuneService.FortuneService;

public class TrackCoach implements Coach {

    FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return String.format("Just do it! %s", fortuneService.getFortune());
    }

    // add init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // add destroy method
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside method doMyCleanUpStuff");
    }
}
