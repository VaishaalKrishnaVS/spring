package com.springl.bean;

import com.springl.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeaker implements Speaker {

    public String makeSound() {
        return "Bose sound";
    }
}
