package com.udemy.spring;

import com.udemy.spring.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        //load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("file:src/applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println("Are both coaches equal? -> " + theCoach.equals(alphaCoach));

        System.out.println("Memory location for theCoach :" + theCoach);

        System.out.println("Memory location for AlphaCoach :" + alphaCoach);

    }
}
