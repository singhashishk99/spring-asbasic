package com.asbasic.implementation;

import com.asbasic.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    public String rotate() {
        return "Vehicle moving with BridgeStone Tyres";
    }
}
