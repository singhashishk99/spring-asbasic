package com.asbasic.main;

import com.asbasic.beans.Vehicle;
import com.asbasic.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
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

        //Vehicle veh = exampleContext.getBean(Vehicle.class); /* NoUniqueBeanDefinitionException*/
        Vehicle veh = exampleContext.getBean("vehicle1", Vehicle.class);
        System.out.println("Vehicle name from Spring context is: " +veh.getName());

        Vehicle veh2 = exampleContext.getBean("vehicle2", Vehicle.class);
        System.out.println("Vehicle name from Spring context is: " +veh2.getName());

        Vehicle veh3 = exampleContext.getBean("vehicle3", Vehicle.class);
        System.out.println("Vehicle name from Spring context is: " +veh3.getName());
    }
}
