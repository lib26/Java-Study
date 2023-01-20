package com.company.interface_;

public class CalculatorImpl implements calculator {

    @Override
    public int plus(int pre, int post) {
        System.out.println(interfaceNum);
        execPlus(1,2);
        return 0;
    }

    @Override
    public int multi(int pre, int post) {
        return 0;
    }
}
