package com.udemy.spring;

import com.udemy.spring.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("file:src/applicationContext.xml");

        // retrieve bean from spring container
        Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);

        // call methods on the bean
        System.out.println(cricketCoach.getDailyFortune());

        //close the context
        context.close();
    }
}