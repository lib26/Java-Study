package com.company.interface_;

public interface calculator {

    // interface 필드. 무조건 final 이다.
    // 따라서 public static final 은 생략 가능하다.
    public static final int interfaceNum = 10;

    // 추상 메서드
    // public abstaract 는 생략 가능하다
    public abstract int plus(int pre, int post);
    public abstract int multi(int pre, int post);

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
