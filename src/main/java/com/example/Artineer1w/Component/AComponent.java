package com.example.Artineer1w.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AComponent {

    BComponent bComponent;
    CComponent cComponent;
    DComponent dComponent;

    public AComponent(BComponent bComponent, CComponent cComponent, DComponent dComponent){
        //생성자 주입으로 의존성 주입
        this.bComponent = bComponent;
        this.cComponent = cComponent;
        this.dComponent = dComponent;
    }
}
