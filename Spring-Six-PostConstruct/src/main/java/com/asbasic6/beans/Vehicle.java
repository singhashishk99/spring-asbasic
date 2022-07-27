package com.asbasic6.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @PostConstruct
        public void initialize(){
            this.name = "Hundai";
        }

        public void printHello() {
        System.out.println("Print from Component Vehicle Bean");
    }

}
