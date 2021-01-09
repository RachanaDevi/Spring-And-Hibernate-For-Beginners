package com.udemy.spring.coach;

import com.udemy.spring.fortuneService.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    // you don't need to define this, we just put it for debugging purpose
    public TennisCoach() {
        System.out.println("TennisCoach: inside default constructor");
    }

    //define the setter method
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("TennisCoach: inside setter method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
