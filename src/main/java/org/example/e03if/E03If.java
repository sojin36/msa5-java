package org.example.e03if;

// IF로 만들어주세요.
// 성적
// 범위 :
//		100   : A+
//		90이상 100미만 : A
//		80이상 90미만 : B
//		70이상 80미만 : C
//		60이상 70미만 : D
//		60미만: F

//출력 문구 : "당신의 점수는 XXX점 입니다. <등급>"

public class E03If {
    public static void main(String[] args) {
        int grade = 100;
        if (grade >= 100){
            System.out.println("A+");
        } else if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else{
            System.out.println("F");
        }


        System.out.printf("당신의 점수는 %d점 입니다.", grade);

        int score = 90;
        String grade2 = "";

        if(score == 100){
            grade2 = "A+";
        } else if (score >= 90) {
            grade2 = "A";
        }

        System.out.printf("당신의 점수는 %d점 입니다. <%s>", score, grade2);

        // 0~100의 숫자가 아닐 경우, 오동작한다.
        // 해당 현상을 아래처럼 수정하시오.
        // 0~100의 숫자가 아닐 경우, "유효한 점수가 아닙니다." 출력
        // 그 외 패턴은 기존과 동일


        int num = 101;
        String grade3 = "";

        if(num < 0 || num > 100) {
            System.out.println("유효한 점수가 아닙니다.");
        } else {
            if(num == 100) {
                grade3 = "A+";
            } else if(num >= 90) {
                grade3 = "A";
            } else if(num >= 80) {
                grade3 = "B";
            } else if(num >= 70) {
                grade3 = "C";
            } else if(num >= 60) {
                grade3 = "D";
            } else {
                grade3 = "F";
            }

            System.out.printf("당신의 점수는 %d점 입니다. <%s>", num, grade3);
        }


        // Switch 문
        int num2 = 1;

        switch (num2){
            case 1:
                System.out.println("1등");
                break;
            case 2:
                System.out.println("2등");
                break;
            case 3:
                System.out.println("3등");
                break;
            default:
                System.out.println("~등");
                break;
        }
    }
}



