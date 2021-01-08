package com.udemy.spring;

import com.udemy.spring.coach.Coach;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanLifecycleDemoApp {
    public static void main(String[] args) {
        //load the spring configuration file
        var context = new ClassPathXmlApplicationContext("file:src/beanLifecycle-applicationContext.xml");


        var theCoach = context.getBean("trackCoach", Coach.class);

        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}