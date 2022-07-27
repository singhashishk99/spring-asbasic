package com.asbasic12.main;

import com.asbasic12.beans.Person;
import com.asbasic12.beans.Vehicle;
import com.asbasic12.config.ProjectConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

    public class Example12 {
        public static void main(String[] args) {
            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
            Person person = context.getBean(Person.class);
            System.out.println("Person name from Spring Context is: " + person.getName());
            System.out.println("Vehicle that Person own is: " + person.getVehicle());
    }
}
