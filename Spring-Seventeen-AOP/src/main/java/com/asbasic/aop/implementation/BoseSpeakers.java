package com.asbasic.aop.implementation;

import com.asbasic.aop.interfaces.Speakers;
import com.asbasic.aop.model.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeakers implements Speakers {
    public String makeSound(Song song) {
        return "Playing the song " + song.getTitle() + " by "
                + song.getSingerName() +
                " with Bose speakers";
    }
}