package com.stackroute;

import com.stackroute.demo.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


//
//
        ApplicationContext context3=new ClassPathXmlApplicationContext("beans.xml");
       HelloWorld hw=(HelloWorld) context3.getBean("helloworld");
        System.out.println(hw.getMessage());
        ((ClassPathXmlApplicationContext) context3).registerShutdownHook();





    }
}
