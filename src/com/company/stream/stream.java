package com.company.stream;

import java.util.*;
import java.util.stream.*;

public class stream {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("keesun");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");

        /*
        * map()은 중개 오퍼레이션 -> Stream 리턴
        * collection()은 종료 오퍼레이션 -> Stream 리턴 X
        * 종료가 되야지만 모든 절차가 실행된다
        * */
        List<String> collect = names.stream().map((s) -> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());

        System.out.println("==========");
        collect.forEach(System.out::println);

        System.out.println("==========");
        names.forEach(System.out::println);
    }

}
