package com.codingshuttle.ishan.week1.introductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component

@ConditionalOnProperty(name = "deploy.env", havingValue = "development")
public class DevDB implements DB{

    public String getData(){
        return "Dev Data";
    }
}
