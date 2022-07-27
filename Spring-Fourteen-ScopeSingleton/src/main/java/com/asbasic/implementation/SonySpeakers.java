package com.asbasic.implementation;

import com.asbasic.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers {
    public String makeSound() {
        return "Playing music with Sony speakers";
    }
}
