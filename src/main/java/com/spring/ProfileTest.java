package com.spring;

import com.spell.InjectSpell;
import com.spring.controllers.HelloController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Configuration
@ComponentScan("./")                //   сканируем на уровень выше
public class ProfileTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("eng");
        ctx.register(ProfileTest.class);
        ctx.refresh();

        HelloController controller = (HelloController) ctx.getBean("helloController");
        controller.sayHello();
    }
}
