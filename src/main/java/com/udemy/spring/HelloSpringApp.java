package com.udemy.spring;

import com.udemy.spring.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //load the spring configuration file to create Spring container
        var context = new ClassPathXmlApplicationContext("file:src/applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}