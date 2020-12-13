package com.udemy.spring;

import com.udemy.spring.coach.Coach;
import com.udemy.spring.coach.TrackCoach;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Coach theCoach = new TrackCoach();
        System.out.println(theCoach.getDailyWorkout());
    }
}
//Track Coach is still hardcoded, let's try to make it in a config file next