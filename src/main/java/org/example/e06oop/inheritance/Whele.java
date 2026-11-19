package org.example.e06oop.inheritance;

public class Whele extends Animal{
        public Whele(String name, String residence){
          super(name, residence);
        }

        public String breath(){
            return String.format("%s이/가 숨을 쉽니다.", this.name);
        }

        public String swimming(){
            return String.format("%s이/가 헤엄칩니다." , this.name );
        }

        public String living(){
            return String.format("%s이/가 %s에서 삽니다." , this.name, this.residence );
        }

    }

//public class FlyingFish extends Animal {
//    public FlyingFish(String name, String residence){
//        super(name, residence);
//        System.out.println("물고기 생성자");
//    }

