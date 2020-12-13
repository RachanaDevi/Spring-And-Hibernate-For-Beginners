package com.udemy.spring;

import com.udemy.spring.coach.BaseballCoach;
import com.udemy.spring.coach.Coach;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Coach theCoach = new BaseballCoach();
        System.out.println(theCoach.getDailyWorkout());
    }
}