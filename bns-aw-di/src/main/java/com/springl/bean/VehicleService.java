package com.springl.bean;

import com.springl.interfaces.Speaker;
import com.springl.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    @Autowired
    private Speaker speaker;
    private Tyre tyre;

    public void playMusic(){
        String music = speaker.makeSound();
        System.out.println(music);
    }

    public void moveForward(){
        String distance = tyre.rotate();
        System.out.println(distance);
    }

    @Autowired
    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}
