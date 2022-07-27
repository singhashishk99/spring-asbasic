package com.asbasic.implementation;

import com.asbasic.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeakers implements Speakers {
    public String makeSound() {
        return "Playing music with Bose Speakers";
    }
}
