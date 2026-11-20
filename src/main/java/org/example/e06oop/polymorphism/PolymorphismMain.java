package org.example.e06oop.polymorphism;

public class PolymorphismMain {
    public static void main(String[] args) {
        Whale whale1 = new Whale();
        Mammal whale2 = new Whale();

        Monkey monkey1 = new Monkey();
        Mammal monkey2 = new Monkey();

        // ----------------------------

        Mammal[] arr = new Mammal[3];
        arr[0] = new Whale();
        arr[1] = new Monkey();

        // ----------------------------
        // 업캐스팅 : 자식클래스가 부모클래스 타입으로 캐스팅 되는 것
        // - 부모클래스로 캐스팅 되면 자식클래스에 있는 멤버에는 접근 불가능
        Mammal upCasting1 = new Whale();

        // 다운캐스팅 : 업캐스팅한 인스턴스를 다시 본인의 데이터 타입으로 캐스팅하는 것
        Whale downCasting1 = (Whale) upCasting1;
        downCasting1.swimming();



    }
}
