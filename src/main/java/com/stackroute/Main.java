package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args){


//
//        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
//        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        Movie movie2=(Movie)((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie1");
//        System.out.println(movie2.getActor());

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie3=(Movie)context.getBean("movie1");
        System.out.println(movie3.getActor());
        ApplicationContext context2=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie4=(Movie)context2.getBean("movie2");
        System.out.println(movie4.getActor());



    }
}
