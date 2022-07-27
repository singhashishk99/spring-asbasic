package com.asbasic.aop.implementation;

import com.asbasic.aop.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {
    public String rotate() {
        return "Vehicle moving with Michelin Tyres";
    }
    public String stop(){
        {
            return "Vehicle stopped using Michelin Tyres";
        }
    }
}
