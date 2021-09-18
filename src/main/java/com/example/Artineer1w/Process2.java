package com.example.Artineer1w;

import com.example.Artineer1w.Component.AComponent;
import com.example.Artineer1w.Component.BComponent;
import com.example.Artineer1w.Component.CComponent;
import com.example.Artineer1w.Component.DComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Process2 implements ApplicationRunner {
    @Autowired
    AComponent aComponent;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(aComponent);
    }
}
