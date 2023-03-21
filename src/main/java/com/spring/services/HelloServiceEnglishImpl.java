package com.spring.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Profile({"eng", "default"})
@PropertySource("classpath:application.properties")
public class HelloServiceEnglishImpl implements HelloService {
    private String greeting;

    @Override
    public String getGreeting() {
        return greeting;
    }


@Value("#{'${greetingEng}'}")
//    @Value("#{T (java.lang.Math).PI}")                            //статичный класс.в виде текста, т.е. поле String greeting
//    @Value("#{new com.spring.services.TestEL().name}")          //нестатичный класс. new - значит создает экземпляр класса
                                            //для Java более по родному #{(new com.spring.services.TestEL()).name}
//    @Value("#{(new com.spring.services.TestEL()).name + '\t' + '${greetingEng}'}\n${greetingEng}")
    public void setGreeting(String greeting) {
        this.greeting = String.valueOf(greeting);
    }
}
