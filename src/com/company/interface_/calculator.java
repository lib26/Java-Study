package com.company.interface_;

public interface calculator {
    public int plus(int pre, int post);
    public int multi(int pre, int post);

    // 재정의 가능
    default int execPlus(int pre, int post){
        // execMulti(1,2); -> access ok
        return pre + post;
    }

    // 재정의 불가능. 클래스 이름으로 호출 가능
    static int execMulti(int pre, int post){
        // execPlus(1,2) -> error!
        return pre * post;
    }
}
