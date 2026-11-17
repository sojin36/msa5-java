package org.example.e04loop;

public class E04Loop {
    public static void main(String[] args) {
        // for(초기값; 조건; 증강연산)
//        for(int i = 0; i<5; i++){
//            System.out.println(i);
//        }
//
//        for(int i = 0; i<2; i++){
//            System.out.println(i);
//            for (int z = 0; z < 5; z++){
//                System.out.print(z);
//            }
//        }


        // 구구단 2~9단을 출력
        for (int x = 2; x < 10; x++){
            System.out.println("**" + x + "단**");
            for (int y = 1; y < 10; y++) {
                System.out.println(x + "*" + y + "=" + (x*y));
            }
        }
        System.out.println();
    }
}

// 구구단 2~9단을 출력
// 예시)
// ** 2단 **
// 2 X 1 = 2
// 2 X 2 = 4
// ...
// ** 3단 **
// 3 X 1 = 3
// 3 X 2 = 6
// ...
// 9 X 8 = 72
// 9 X 9 = 81

