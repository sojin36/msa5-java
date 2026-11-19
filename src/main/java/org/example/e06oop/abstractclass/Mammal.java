package org.example.e06oop.abstractclass;

public abstract class Mammal {
    protected String name;
    protected String residence;

    public String breath(){
        return String.format("%s이/가 숨 쉰다.", this.name);
    }


    // 추상 메소드 : 상속 관계에서 자식 클래스에게 특정 기능을 반드시 구현하도록 강제하는 메소드

    /**
     * 해당 메소드는 반드시 사는 곳을 출력하기 위해 문자열을 반환하는 작업을해라
     * @return
     */

    public abstract String living();
}
