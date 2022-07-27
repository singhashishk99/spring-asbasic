package com.asbasic.aop.implementation;

import com.asbasic.aop.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    public String rotate() {
        return "Vehicle moving with BridgeStone Tyres";
    }
    public String stop(){
        return "Vehicle stopped using BridgeStone Tyres";
    }
}
