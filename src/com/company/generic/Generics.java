package com.company.generic;

class Soccer{
    public String team;
    Soccer(String team){
        this.team = team;
    }
}

class Player<T, S>{
    public T team;
    public S name;

    Player(T team, S name){
        this.team = team;
        this.name = name;
    }
}

public class Generics {

    public static void main(String[] args) {

        Player<Soccer, String> player = new Player<Soccer, String>(new Soccer("ManUtd"), "JSPark");
        System.out.println();
    }
}

