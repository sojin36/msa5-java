package org.example.e07exception;

import java.io.FileWriter;
import java.io.IOException;

public class E07Exception {
    public static void main(String[] args) {
        try{
            System.out.println("트라이시작");
            throw new Exception("에러");
//            double result = 10/0;
//
//            System.out.println("트라이 끝");
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException 발생");
        } catch(Exception e){
            System.out.println("캐치 시작");
            System.out.println(e.getMessage());
            System.out.println("캐치 끝");
        } finally {
            System.out.println("파이널리");
        }

        // Try with Resource
        FileWriter file = null;

        try{
            // 파일을 쓰기 모드로 불러오기
            file = new FileWriter("text.txt");
            file.write("하이");
        } catch (IOException e){
            e.printStackTrace();

        } finally {
            try {
                if (file != null){
                    file.close();
                }
                file.close();
            } catch (IOException e){
                e.printStackTrace();
            }

        }

        try (FileWriter file1 = new FileWriter("text.txt")){
            file.write("하이요");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
