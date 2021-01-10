package com.udemy.spring.configuration;

import com.udemy.spring.coach.Coach;
import com.udemy.spring.coach.SwimCoach;
import com.udemy.spring.fortuneService.FortuneService;
import com.udemy.spring.fortuneService.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.udemy.spring") We don't use component scan when defining beans
@PropertySource("classpath:sport.properties")
public class SportConfig {

    //define bean for sad fortune Service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    //define bean for our swim coach and inject dependency
    @Bean
    public Coach swimCoach() { //swimCoach is the bean id by spring container
        return new SwimCoach(sadFortuneService());
    }
}
