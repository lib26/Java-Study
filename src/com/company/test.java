package com.company;

public class test {

    private int a;
    private String b;
    private double c;

    //
    public static String classVar = "class var";
    public String instanceVar = "instance var";

    public static void classMethod(){
        System.out.println("class method");
    }
    public void instanceMethod(){
        System.out.println(classVar);
    }
}
