package com.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by jiangcaijun on 2017/3/10.
 */
public class dubboTest {

    public static void main(String []args) throws IOException {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(new String("provider.xml"));

        classPathXmlApplicationContext.start();

        System.in.read();
    }
}