package com.company.anonymousClass_Lambda;

public class Main {
    public static void main(String[] args) {
        // 계산할 두 수
        int num1 = 20;
        int num2 = 10;

        Calculator calculator = new Calculator(num1, num2);

        // 재정의한 익명 구현 객체를 caculate() 인자로
        // calculator.caculate() 매서드 내에서 재정의된 operate() 메소드가 실행되어 a + b가 리턴 됨
        int result = calculator.caculate(new Operate() {
            public int operate(int a, int b) {
                return a + b;
            }
        });
        System.out.println(result); // 30

        // operate() 재정의한 익명 구현 객체를 람다 표현식으로 바꿈
        // calculator.caculate() 매서드에 람다식을 넣음
        Operate operate = (a, b) -> a - b;
        int result2 = calculator.caculate(operate);
        System.out.println(result2); // 10

    }
}
