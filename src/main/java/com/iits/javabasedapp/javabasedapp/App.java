package com.iits.javabasedapp.javabasedapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import skill.myapp.Employee;

public class App {
    public static void main( String[] args ) {
        ApplicationContext
        context=new AnnotationConfigApplicationContext(MyConfiguration.class);
        
        Employee employee=(Employee)context.getBean("emp");
        System.out.println(employee);
    }
}
