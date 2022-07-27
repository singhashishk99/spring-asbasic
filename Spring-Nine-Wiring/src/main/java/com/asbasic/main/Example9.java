package com.asbasic.main;

import com.asbasic.beans.Person;
import com.asbasic.beans.Vehicle;
import com.asbasic.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example9 {
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
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());
    }
}
