package com.udemy.spring;

import com.udemy.spring.coach.Coach;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HelloSpringApp {

    public static void main(String[] args) {
        //load the spring configuration file to create Spring container
        var context = new ClassPathXmlApplicationContext("file:src/applicationContext.xml");

        //retrieve bean from spring container
        Coach trackCoach = context.getBean("trackCoach", Coach.class);

        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyFortune());

        context.close();
    }
}