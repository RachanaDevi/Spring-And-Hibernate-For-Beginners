package com.udemy.spring.fortuneService;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is an unlucky day! Oops! Better luck next time.";
    }
}
