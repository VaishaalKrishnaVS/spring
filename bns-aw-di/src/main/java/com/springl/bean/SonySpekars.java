package com.springl.bean;

import com.springl.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class SonySpekars implements Speaker {

    public String makeSound() {
        return "sony sound";
    }
}
