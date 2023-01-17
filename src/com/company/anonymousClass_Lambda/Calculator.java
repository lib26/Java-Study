package com.company.anonymousClass_Lambda;

// 계산을 담당하는 클래스
class Calculator {
    // 계산할 두 수를 저장하는 필드
    private final int a;
    private final int b;

    // 생성자
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // 인터페이스 타입을 매개변수로 받는 메소드 (다형성)
    public int caculate(Operate op) {
        return op.operate(this.a, this.b); // 매개변수 객체의 메서드 실행하여 리턴
    }
}