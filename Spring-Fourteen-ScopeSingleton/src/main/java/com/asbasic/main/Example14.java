package com.asbasic.main;

import com.asbasic.beans.Person;
import com.asbasic.config.ProjectConfig;
import com.asbasic.service.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

    public class Example14 {
        public static void main(String[] args) {
            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
            VehicleServices vehicleService1 = context.getBean(VehicleServices.class);
            VehicleServices vehicleService2 = context.getBean("vehicleServices", VehicleServices.class);
            System.out.println("Hascode of the object vehicleService1 : " +vehicleService1);
            System.out.println("Hascode of the object vehicleService2 : " +vehicleService2);

            if(vehicleService1==vehicleService2) {
                System.out.println("Vehicle services bean is a singleton scoped bean");
            }else{
                System.out.println("Vehicle services bean is a prototype scoped bean");
            }
    }
}
