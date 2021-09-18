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
public class Process implements ApplicationRunner {
    @Autowired //생략가능
    AComponent aComponent;

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        //memory에 A컴포넌트를 2개 만들어놓고 각 프로세스마다 따로쓰는 구조 -> 메모리 낭비
//        BComponent bComponent = new BComponent();
//        CComponent cComponent = new CComponent();
//        DComponent dComponent = new DComponent();
//        //A컴포넌트는 B컴포넌트, C컴포넌트, D컴포넌트에 의존
//        AComponent aComponent = new AComponent(bComponent, cComponent, dComponent);

//        //Container사용을 통해 A컴포넌트에만 포커스를 맞출수있음
//        AComponent aComponent = Container.getInstance().getaComponent();


        //aComponent 인스턴스 주소 출력 (Process2와 동일한 인스턴스를 반환)
        System.out.println(aComponent);
    }
}
