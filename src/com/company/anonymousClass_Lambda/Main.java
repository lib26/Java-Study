package com.company.anonymousClass_Lambda;

public class Main {
    public static void main(String[] args) {
        // 계산할 두 수
        int num1 = 20;
        int num2 = 10;

        // Calculator 클래스 생성하며 계산 할 수를 클래스 필드에 저장
        Calculator calculator = new Calculator(num1, num2);

        // calculator.caculate() 메서드 인자로, operate() 추상 메소드를 더하기 연산이 되도록 재정의한 익명 구현 객체를 넘김
        // calculator.caculate() 매서드 내에서 재정의된 operate() 메소드가 실행되어 a + b가 리턴 됨
        int result = calculator.caculate(new Operate() {
            public int operate(int a, int b) {
                return a + b;
            }
        });

        System.out.println(result); // 30


        // calculator.caculate() 메서드 인자로, operate() 추상 메소드를 빼기 연산이 되도록 재정의한 익명 구현 객체를 넘김
        // calculator.caculate() 매서드 내에서 재정의된 operate() 메소드가 실행되어 a - b가 리턴 됨
        int result2 = calculator.caculate(new Operate() {
            public int operate(int a, int b) {
                return a - b;
            }
        });

        System.out.println(result2); // 10
    }
}
