package com.udemy.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        BaseballCoach theCoach = new BaseballCoach();
        System.out.println(theCoach.getDailyWorkout());
    }
}