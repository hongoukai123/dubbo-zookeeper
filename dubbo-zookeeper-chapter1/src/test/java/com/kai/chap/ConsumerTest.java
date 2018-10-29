package com.kai.chap;

import com.kai.chap.service.IDemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerTest {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:consumer.xml"});
        context.start();
        IDemoService demoService = (IDemoService) context.getBean("demoService");
        String hello = demoService.sayHello("Jack");
        System.out.println(hello);
    }

}
