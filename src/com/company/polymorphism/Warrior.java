package com.company.polymorphism;

import com.company.polymorphism.Hero;

public class Warrior extends Hero {

    public Warrior(String name){
        super(name);
    }

    public void groundCutting(){
        System.out.println("대지 가르기!");
    }
}
