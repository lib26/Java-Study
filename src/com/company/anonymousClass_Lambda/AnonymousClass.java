package com.company.anonymousClass_Lambda;

// 부모 클래스
class Animal {
    public void bark() {
        System.out.println("동물이 웁니다");
    }
}

/**
 * 익명 클래스
 */
public class AnonymousClass {

        public static void main(String[] args) {
            // 선언과 동시에 객체 생성
            Animal dog = new Animal() {
                @Override
                public void bark() {
                    run(); // 익명 클래스에서 새로 정의한 메소드는 이렇게 내부에서만 사용가능
                    System.out.println("개가 짖습니다");
                }

                // 자식에서 새로 정의한 메소드
                public void run() {
                    System.out.println("달리기 ㄱㄱ싱");
                }

            };

            dog.bark();
            //dog.run(); // ! Error - 외부에서 호출 불가능
        }
}
