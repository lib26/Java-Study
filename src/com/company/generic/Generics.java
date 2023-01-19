package com.company.generic;

class Soccer{
    public String team;
    Soccer(String team){
        this.team = team;
    }
}

class Player<T, S, R>{
    public T team;
    public S name;

    Player(T team, S name){
        this.team = team;
        this.name = name;
    }

    public R method(R num){
        return num;
    }

}

public class Generics {

    public static void main(String[] args) {

        Player<Soccer, String, Integer> player = new Player<Soccer, String, Integer>(new Soccer("ManUtd"), "JSPark");
        System.out.println();
    }
}

