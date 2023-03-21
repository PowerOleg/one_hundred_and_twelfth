package com.spring.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Profile("fr")
@PropertySource("classpath:application.properties")
public class HelloServiceFrenchImpl implements HelloService {
    private String greeting;
    @Override
    public String getGreeting() {
        return greeting;
    }

    @Value(value = "${greetingFr}")
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
