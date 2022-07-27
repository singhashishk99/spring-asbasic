package com.asbasic7a.main;

import com.asbasic7a.beans.Vehicle;
import com.asbasic7a.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example7a {
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

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber = " + randomNumber);

        if((randomNumber% 2) == 0){
            exampleContext.registerBean("volkswagen",
                    Vehicle.class,volkswagenSupplier);
        }else{
            exampleContext.registerBean("audi",
                    Vehicle.class,audiSupplier);
        }
        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;
        try {
            volksVehicle = exampleContext.getBean("volkswagen",Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating Volkswagen vehicle");
        }
        try {
            audiVehicle = exampleContext.getBean("audi",Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating Audi vehicle");
        }

        if(null != volksVehicle){
            System.out.println("Programming Vehicle name from Spring Context is: " + volksVehicle.getName());
        }else{
            System.out.println("Programming Vehicle name from Spring Context is: " + audiVehicle.getName());
        }
    }
}
