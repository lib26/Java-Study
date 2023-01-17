package com.company.polymorphism;

import com.company.polymorphism.Hero;

public class Wizard extends Hero {

    public Wizard(String name){
        super(name);
    }

    public void freezing(){
        System.out.println("얼리기!");
    }
}