package com.example.Artineer1w;

import com.example.Artineer1w.Component.AComponent;
import com.example.Artineer1w.Component.BComponent;
import com.example.Artineer1w.Component.CComponent;
import com.example.Artineer1w.Component.DComponent;

//Container 예시(참고용)
//의존성 관리
//컴포넌트 요소를 만들어 싱글톤 패턴 타입 구현 -> 더 효율적으로 공간사용 가능
//싱글톤 : 동일한 클래스 타입의 객체 인스턴스를 오직 하나만 생성하고 쓰는 구조
public class Container {
    private static final Container sigleton = new Container();
    //필드선언
    private AComponent aComponent;
    private BComponent bComponent;
    private CComponent cComponent;
    private DComponent dComponent;

    //생성자, 새로운 인스턴스 생성을 막기위해 private 선언
    private Container(){    }

    public static Container getInstance(){
        return sigleton;
    }

    public synchronized AComponent getaComponent(){
        //null이면 인스턴스 하나 생성
        if(bComponent == null){
            bComponent = new BComponent();
        }

        if(cComponent == null){
            cComponent = new CComponent();
        }

        if(dComponent == null){
            dComponent = new DComponent();
        }

        if(aComponent == null){
            aComponent = new AComponent(bComponent, cComponent, dComponent);
        }

        return aComponent;
    }
}
