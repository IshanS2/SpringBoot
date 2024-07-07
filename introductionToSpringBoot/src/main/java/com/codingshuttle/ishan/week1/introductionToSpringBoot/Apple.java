package com.codingshuttle.ishan.week1.introductionToSpringBoot;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Apple {

    void eatApple(){
        System.out.println("i am eating ");
    }

    @PostConstruct
    void callThisBeforeAppleIsUsed(){
        System.out.println("Creating apple");
    }

    @PreDestroy
    void CallThisBeforeDestroy(){
        System.out.println("Destroying");
    }
}
