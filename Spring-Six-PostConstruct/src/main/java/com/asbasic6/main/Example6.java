package com.asbasic6.main;

import com.asbasic6.beans.Vehicle;
import com.asbasic6.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example6 {
    public static void main(String[] args) {
        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        */
        /* AnnotationConfigApplicationContext is the implementation of ApplicationContext(a type of IoC
        container) interface. ProjectConfig.class is used to tell the IoC container about the project
        related configuration
         */
        var exampleContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // to provide the default bean(when user is not providing bean name,value or method),
        // then annotate the default class as @Primary
        Vehicle veh = exampleContext.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring context is: " +veh.getName());
        veh.printHello();
    }
}
