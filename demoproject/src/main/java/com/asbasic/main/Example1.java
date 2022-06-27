package com.asbasic.main;

import com.asbasic.beans.Vehicle;
import com.asbasic.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        /* simple java object rather than a bean */
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context is: " +vehicle.getName());
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

        Vehicle veh = exampleContext.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring context is: " +veh.getName());

        String hello = exampleContext.getBean(String.class);
        System.out.println("String value from Spring context is: " +hello);

        Integer num = exampleContext.getBean(Integer.class);
        System.out.println("integer value from Spring context is: " +num);

    }
}
