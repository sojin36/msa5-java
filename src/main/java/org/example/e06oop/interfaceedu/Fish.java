package org.example.e06oop.interfaceedu;

abstract class Fish {
    protected String name;
    protected String residence;

    Fish(String name, String residence){
        this.name = name;
        this.residence = residence;
    }

    abstract String residence();

    public String birth(){
        return String.format("%s이/가 알 낳음", this.name);
    }

}
