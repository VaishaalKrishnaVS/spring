package com.springl.bean;

import com.springl.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class CeitTyre implements Tyre {
    @Override
    public String rotate() {
        return "CEIT Tyre";
    }
}
