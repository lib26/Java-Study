package com.company.polymorphism;

public class Archer extends Hero {

    public Archer(String name){
        super(name);
    }

    public void fireArrow(){
        System.out.println("불화살!");
    }
}
