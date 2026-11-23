package org.example.e09generics;

public class BoxMain {
    public static void main(String[] args) {
        Box<int[]> boxIntArr = new Box<>(new int[3]);
        Box<String[]> boxStringArr = new Box<>(new String[3]);
        Box<Integer> boxInt = new Box<>(1);

//        BoxRestrict<Tv> boxRestrict1 = new BoxRestrict<>();
//        BoxRestrict<Mobile> boxRestrict2 = new BoxRestrict<>();
//        BoxRestrict<Novel> boxRestrict3 = new BoxRestrict<>();
    }
}
