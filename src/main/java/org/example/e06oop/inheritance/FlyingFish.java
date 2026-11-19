package org.example.e06oop.inheritance;

import javax.xml.namespace.QName;

public class FlyingFish extends Animal {
    public FlyingFish(String name, String residence){
        super(name, residence);
        System.out.println("물고기 생성자");
    }


    public String flying(){
        return String.format("%s이/가 날아갑니다." , super.name );
    }

    // 오버라이딩(Overriding) : 부모님께서 상속받은 메소드를 자식이 재정의 하여 사용
    @Override
    public String living(){
        return "수정했다.";
    }
}

