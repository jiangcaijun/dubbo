package com.dubbo.demo.provider;

import com.dubbo.demo.IHelloWorld;

/**
 * Created by jiangcaijun on 2017/3/10.
 */
public class HelloWorldServiceImpl implements IHelloWorld {

    public String sayHello(String name) {
        return "Hello World  " + name + ", I come from dubbo-api " ;
    }

    public Object doSomeThing() {
        return "i am doSomeThing, I come from dubbo-api " ;
    }
}