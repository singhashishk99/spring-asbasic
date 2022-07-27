package com.asbasic5.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void printHello() {
        System.out.println("Print from Component Vehicle Bean");
    }
}