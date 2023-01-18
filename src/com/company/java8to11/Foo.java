package com.company.java8to11;

public class Foo {
    public static void main(String[] args) {
        // 람다 표현식으로 바꾼 익명 구현 객체
        RunSomething runSomething = () -> System.out.println("hi");
        runSomething.doIt();
    }
}
