package com.company.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<String>();
        String[] sb;


        Scanner sc = new Scanner(System.in);
        
        Hero[] heroes = new Hero[3];
        heroes[0] = new Warrior("전사");
        heroes[1] = new Archer("궁수");
        heroes[2] = new Wizard("마법사");

        for(int i =0;i<heroes.length;i++){
            heroes[i].attack();

            if (heroes[i] instanceof Warrior){
                Warrior temp = (Warrior) heroes[i];
                temp.groundCutting();
            }
            else if (heroes[i] instanceof Archer){
                Archer temp = (Archer) heroes[i];
                temp.fireArrow();
            }
            else if (heroes[i] instanceof Wizard){
                Wizard temp = (Wizard) heroes[i];
                temp.freezing();
            }
        }

    }
}
