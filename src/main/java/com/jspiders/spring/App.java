package com.jspiders.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring.dto.Bike;
import com.jspiders.spring.dto.Car;

public class App {
    public static void main(String[] args) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml"); // xml-file --> example name (not actual file)
//        context = new FileSystemXmlApplicationContext("xml-file");
//        context = new AnnotationConfigApplicationContext("java-file");  
        System.out.println("Created");
        System.out.println();
        System.out.println(context.getBean(Bike.class));
        System.out.println(context.getBean("bike2",Bike.class));
        System.out.println();
        System.out.println(context.getBean(Car.class));
        System.out.println(context.getBean("car2",Car.class));
    }
}
