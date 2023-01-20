package com.company.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(6, "The Java, Test", true));
        javaClasses.add(new OnlineClass(7, "The Java, Code manipulation", true));
        javaClasses.add(new OnlineClass(8, "The Java, 8 to 11", false));

        List<List<OnlineClass>> keesunEvents = new ArrayList<>();
        keesunEvents.add(springClasses);
        keesunEvents.add(javaClasses);

        System.out.println("======================");
        System.out.println("spring 으로 시작하는 수업");
        springClasses.stream().filter(new Predicate<OnlineClass>() {
            @Override
            public boolean test(OnlineClass onlineClass) {
                return onlineClass.getTitle().startsWith("spring");
            }
        }).forEach(new Consumer<OnlineClass>() {
            @Override
            public void accept(OnlineClass onlineClass) {
                System.out.println(onlineClass.getId());
            }
        });

        /*
        springClasses.stream()
                .filter(onlineClass->onlineClass.getTitle().startsWith("spring"))
                .forEach(onlineClass-> System.out.println(onlineClass.getId()));
        */

        System.out.println("======================");
        System.out.println("close 되지 않은 수업");
        springClasses.stream()
                .filter(onlineClass->!onlineClass.isClosed()) // Predicate.not(OnlineClass::isClosed) 로 표현 가능. 임의 객체 인스턴스 메소드 참조.
                .forEach(onlineClass-> System.out.println(onlineClass.getId()));

        // map 에서 onlineClass 였던 데이터가 String으로
        System.out.println("======================");
        System.out.println("수업 이름만 모아서 스트림 만들기");
        springClasses.stream()
                .map(onlineClass -> onlineClass.getTitle()) // map(OnlineClass::getTitle) 로 표현가능
                .forEach(s -> System.out.println(s)); // forEach(System.out::println) 로 표현가능

        System.out.println("======================");
        System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
        keesunEvents.stream()
                .flatMap(list->list.stream()) // flatMap(Collection::stream) 로 표현가능
                .forEach(onlineClass -> System.out.println(onlineClass.getId()));

        System.out.println("======================");
        System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만");
        Stream.iterate(10, i -> i + 1)
                .skip(10)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("======================");
        System.out.println("자바 수업 중에 Test가 들어있는 수업이 있는지 확인");
        boolean test = javaClasses.stream().anyMatch(onlineClass -> onlineClass.getTitle().contains("Test"));
        System.out.println(test);

        System.out.println("======================");
        System.out.println("스프링 수업 중에 제목에 spring이 들어간 것만 모아서 List로 만들기");
        List<String> spring = springClasses.stream()
                .filter(onlineClass -> onlineClass.getTitle().contains("spring"))
                .map(onlineClass -> onlineClass.getTitle())// OnlineClass::getTitle로 표현 가능
                .collect(Collectors.toList());
                spring.forEach(System.out::println);
    }
}
