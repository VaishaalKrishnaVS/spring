package com.springl.bean;

import com.springl.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MrfTyre implements Tyre {
    @Override
    public String rotate() {
        return "MRF tyre";
    }
}
