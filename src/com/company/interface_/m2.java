package com.company.interface_;

public class m2 {

    public static void main(String[] args) {

        // 한번 쓰고 버려질 익명 구현 객체
        calculator functionalInter = new calculator() {
            @Override
            public int plus(int pre, int post) {
                return 0;
            }

            @Override
            public int multi(int pre, int post) {
                return 0;
            }
        };
        System.out.println(functionalInter.interfaceNum); // 10
        functionalInter.plus(1,2);
        functionalInter.multi(1,2);
        functionalInter.execPlus(1,2); // 인터페이스 default method
        calculator.execMulti(1,2); // 인터페이스 static method

        // 계속해서 쓰일 implement를 수행하는 객체
        CalculatorImpl cal = new CalculatorImpl();
        System.out.println(cal.interfaceNum); // 10
        int resultPlus = cal.plus(3, 9);
        int resultMulti = cal.multi(3, 9);
        int resultExecPlus = cal.execPlus(3, 9); // 인터페이스 default method
        int resultExecMulti = calculator.execMulti(3, 9); // 인터페이스 static method
    }
}
