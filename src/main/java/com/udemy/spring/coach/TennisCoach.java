package com.udemy.spring.coach;

import com.udemy.spring.fortuneService.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // you don't need to define this, we just put it for debugging purpose
    public TennisCoach() {
        System.out.println("TennisCoach: inside default constructor");
    }

    //init method
    @PostConstruct
    void doStartup() {
        System.out.println("TennisCoach: inside setup");
    }

    //destroy method
    @PreDestroy
    void doDestroy() {
        System.out.println("TennisCoach: outside setup");
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
