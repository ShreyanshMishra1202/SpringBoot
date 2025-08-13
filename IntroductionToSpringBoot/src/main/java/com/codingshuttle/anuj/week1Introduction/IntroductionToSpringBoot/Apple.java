package com.codingshuttle.anuj.week1Introduction.IntroductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component     // Use this if not declaring bean in AppConfig
public class Apple {

    void eatApple(){
        System.out.println("I am eating an Apple.");
    }

    @PostConstruct
    void CallThisBeforeAppleIsUsed(){
        System.out.println("Creating the apple before use");
    }

    @PreDestroy
    void CallThisBeforeAppleIsDestroyed(){
        System.out.println("Destroying the Apple Bean");
    }
}
