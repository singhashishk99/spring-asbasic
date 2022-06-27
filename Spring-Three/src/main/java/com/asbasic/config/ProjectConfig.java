package com.asbasic.config;

import com.asbasic.beans.Vehicle;
import org.springframework.context.annotation.Bean;

public class ProjectConfig {
    /*
@Bean annotation, which lets Spring know that it needs to call
this method when it initializes its context and adds the returned
value to the context.
* */
    @Bean(name="audiVehicle")
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Audi 9");
        return veh;
    }

    @Bean(value="hundaiVehicle")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Hundai 7");
        return veh;
    }

    @Bean("MarutiVehicle")
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Maruti 6");
        return veh;
    }
}
