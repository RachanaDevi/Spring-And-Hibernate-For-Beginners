package com.udemy.spring;

import com.udemy.spring.coach.Coach;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanScopeDemoApp {
    public static void main(String[] args) {
        //load the spring configuration file
        var context = new ClassPathXmlApplicationContext("file:src/beanScope-applicationContext.xml");


        var theCoach = context.getBean("trackCoach", Coach.class);
        //retrieve bean from spring container
        var alphaCoach = context.getBean("trackCoach", Coach.class);
        System.out.println("Are both coaches same?->" + theCoach.equals(alphaCoach));

        System.out.println("Memory location for theCoach->" + theCoach);
        System.out.println("Memory location for alphaCoach->" + alphaCoach);

        context.close();
    }
}