package com.company.anonymousClass_Lambda.java8to11;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Foo {
    public static void main(String[] args) {

        // 람다 표현식으로 바꾼 익명 구현 객체
        RunSomething runSomething = () -> System.out.println("hi");
        runSomething.doIt();

        // 자바에서 제공하는 함수형 인터페이스
        // Function<T, R>
        // T 타입을 받아서 R 타입을 리턴하는 함수 인터페이스
        Function<Integer, Integer> plus10 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 10;
            }
        };
        System.out.println(plus10.apply(1));

        // 이런식으로 타입은 사용자가 지정
        Function<RunSomething, RunSomething> si = new Function<RunSomething, RunSomething>() {
            @Override
            public RunSomething apply(RunSomething runSomething) {
                runSomething.doIt();
                return runSomething;
            }
        };
        si.apply(runSomething).doIt();

        System.out.println("--------------------");

        // compose, andThen 함수 조합용 메서드
        Function<Integer,Integer> plus20 = i -> i+20;
        Function<Integer,Integer> multiply2 = i -> i*2;
        // compose : 곱한 값을 리턴해서 plus20에 입력값으로 넘긴다
        Function<Integer,Integer> multiply2AndPlus20 = plus20.compose(multiply2);
        System.out.println(multiply2AndPlus20.apply(1)); // 22
        // andThen : 더한 값을 리턴해서 multiply2에 입력값으로 넘긴다.
        System.out.println(plus20.andThen(multiply2).apply(1)); // 42

        // Consumer<T>
        // T 타입을 받아서 아무값도 리턴하지 않는 함수 인터페이스
        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(15); // 10

        // Supplier<T>
        // T 타입의 값을 제공하는 함수 인터페이스
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get()); // 10

        // Predicate<T>
        // T 타입을 받아서 boolean을 리턴하는 함수 인터페이스
        Predicate<String> startsWithinbum = (s) -> s.startsWith("inbum");
        System.out.println(startsWithinbum.test("inbum")); // true

    }
}
