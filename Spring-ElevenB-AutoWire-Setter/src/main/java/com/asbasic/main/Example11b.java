package com.asbasic.main;

import com.asbasic.beans.Person;
import com.asbasic.beans.Vehicle;
import com.asbasic.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example11b {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person1 = context.getBean(Person.class);
        Vehicle vehicle1 = context.getBean(Vehicle.class);

        System.out.println(person1.getName());
        System.out.println(vehicle1.getName());
        System.out.println(person1.getName() + " has " + person1.getVehicle());
    }
}
