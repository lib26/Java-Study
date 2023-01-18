package com.company.java8to11;

import java.util.function.Function;

public class Foo {
    public static void main(String[] args) {

        // 람다 표현식으로 바꾼 익명 구현 객체
        RunSomething runSomething = () -> System.out.println("hi");
        runSomething.doIt();

        // 자바에서 제공하는 함수형 인터페이스
        Function<Integer, Integer> plus10 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 10;
            }
        };
        System.out.println(plus10.apply(1));

        // 이런것도 가능
        Function<RunSomething, RunSomething> si = new Function<RunSomething, RunSomething>() {
            @Override
            public RunSomething apply(RunSomething runSomething) {
                runSomething.doIt();
                return runSomething;
            }
        };
        si.apply(runSomething).doIt();

        // compose, andThen
        Function<Integer,Integer> plus20 = (i) -> i+20;
        Function<Integer,Integer> multiply2 = (i) -> i*2;

        // compose : 곱한 값을 리턴해서 plus20에 입력값으로 넘긴다
        Function<Integer,Integer> multiply2AndPlus20 = plus20.compose(multiply2);
        System.out.println(multiply2AndPlus20.apply(1)); // 22

        // andThen : 더한 값을 리턴해서 multiply2에 입력값으로 넘긴다.
        System.out.println(plus20.andThen(multiply2).apply(1)); // 42

    }
}
