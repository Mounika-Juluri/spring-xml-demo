package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


//
//        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
//        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        Movie movie2=(Movie)((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie1");
//        System.out.println(movie2.getActor());

//        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//        Movie movie3=(Movie)context.getBean("movie1");
//        System.out.println(movie3.getActor());
//        ApplicationContext context2=new ClassPathXmlApplicationContext("beans.xml");
//        Movie movie4=(Movie)context2.getBean("movie2");
//        System.out.println(movie4.getActor());

        ApplicationContext context3=new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean demo=(BeanLifecycleDemoBean) context3.getBean("bean-lifecycle");
((ClassPathXmlApplicationContext) context3).registerShutdownHook();




    }
}
