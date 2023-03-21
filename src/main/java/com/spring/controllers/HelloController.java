package com.spring.controllers;

import com.spring.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloController {
    private HelloService helloService;



    public void sayHello() {
        System.out.println(helloService.getGreeting());
    }

    @Autowired                                                                          //!!!!!!!!!!!!!!!!!!
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}
