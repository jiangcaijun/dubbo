package com.dubbo.demo.consumer;

import com.dubbo.demo.IHelloWorld;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by jiangcaijun on 2017/3/10.
 */
public class dubboConsumerTest {

    public static void main(String []args) throws IOException {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(new String("consumer.xml"));

        IHelloWorld iHelloWorld = (IHelloWorld)classPathXmlApplicationContext.getBean("helloService");

        String result = iHelloWorld.sayHello("哈哈哈");

        System.out.println("dubboConsumerTest.main: " + result);

        Object object = iHelloWorld.doSomeThing();

        System.out.println("dubboConsumerTest.main: " + object.toString());
    }
}
