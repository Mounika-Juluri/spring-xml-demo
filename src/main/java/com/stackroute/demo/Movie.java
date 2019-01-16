package com.stackroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private ApplicationContext applicationContext;
    private BeanFactory beanFactory;
    private String beanName;

    private Actor actor;

    Movie()
    {

    }


    public Actor getActor() {
        return actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("inside beanfactory");
        this.beanFactory=beanFactory;

    }

    public void setBeanName(String s) {
        System.out.println("inside bean name"+s);
        this.beanName=s;

    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("inside application context");
       this.applicationContext=applicationContext;
        System.out.println( applicationContext);


    }
}

