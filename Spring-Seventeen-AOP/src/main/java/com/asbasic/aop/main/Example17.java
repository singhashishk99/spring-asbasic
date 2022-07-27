package com.asbasic.aop.main;

import com.asbasic.aop.config.ProjectConfig;
import com.asbasic.aop.model.Song;
import com.asbasic.aop.service.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

    public class Example17 {
        public static void main(String[] args) {
            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
            var vehicleService1 = context.getBean(VehicleServices.class);
            System.out.println(vehicleService1.getClass());

            Song song = new Song();
            song.setTitle("Black Space");
            song.setSingerName("Taylor Swift");

            boolean vehicleStarted = false;
            String moveVehicleStatus = vehicleService1.moveVehicle(vehicleStarted);
            String playMusicStatus = vehicleService1.playMusic(vehicleStarted, song);
            String applyBreakStatus = vehicleService1.applyBrake(vehicleStarted);

    }
}
