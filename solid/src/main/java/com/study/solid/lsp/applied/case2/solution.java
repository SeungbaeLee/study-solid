package com.study.solid.lsp.applied.case2;

public class solution {
    abstract class Animal {
    }

    interface Speakable {
        void legs();
    }

    class Cat extends Animal implements Speakable {
        public void legs() {
            System.out.println("4");
        }
    }

    class dog extends Animal implements Speakable  {
        public void legs() {
            System.out.println("4");
        }
    }

    class Fish extends Animal {
    }
}
/**
 * 인터페이스를 새로 만들어 기능 부분을 빼서 cat과 dog만 구현, fish는 구현 X
 * abstract는 모두 상속
 *
 */
