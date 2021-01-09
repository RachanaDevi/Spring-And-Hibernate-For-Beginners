package com.udemy.spring;

import com.udemy.spring.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        //read spring config file
        var context = new ClassPathXmlApplicationContext("file:src/applicationContext.xml");

        //get bean from spring container
        var tennisCoach = context.getBean("thatSillyCoach", Coach.class);

        //call the method on the bean
        System.out.println(tennisCoach.getDailyWorkout());

        //close the container
        context.close();
    }
}
