package org.example.e01datatype;

public class E01DataType {
    public void execute() {
        boolean bool = true;
        bool = false;
        // bool = 1; 선언할 때의 데이터 타입과 다를 경우, 타입에러 발생
        System.out.println(bool);
        System.out.println(bool);
        System.out.printf("현재 변수 bool의 값은 %S", bool);


        // 변수 선언
        int age;
        age = 1;
        char ch = 'a';
        String str = "a";


        // 상수
        final String USER_NAME = "소진";

        // Underscore 표기법
        int num = 1_020_301_054;

        // 두 변수의 값을 스와핑 해보자.
        int swap1 = 1;
        int swap2 = 2;

        swap1 = 2;
        swap1 = swap2;
        swap2 = 1;

        int tmp;
        tmp = swap1;
        swap1 = swap2;
        swap2 = tmp;

        // 데이터 타입
        boolean bool2 = true;

        byte bt = -128;
        short sh = 32767;
        int integer = 2147483647;
        long longer = 2147483648L; // Long 타입은 반드시 가장 뒤에 'L' 붙이기

        double db = 3.14584;
        float ft = 3.14584F; // float 타입은 반드시 가장 뒤에 'F' 붙이기

        char ch1 = 'g';
    }
}


