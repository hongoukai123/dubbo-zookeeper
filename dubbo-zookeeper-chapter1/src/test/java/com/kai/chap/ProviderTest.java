package com.kai.chap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderTest {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:provider.xml"});
        context.start();
        //为保证服务一直开着，利用输入流的阻塞来模拟
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
