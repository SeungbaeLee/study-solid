package com.study.solid.lsp.unapplied.case1;

public class Main {
    public static void main(String[] args) {
//        Animal eagle = new Eagle();
//        eagle.go(10, true);
        /**
         * 자식 클래스가 아예 부모클래스의 메소드의 타입, 매개변수 갯수까지 바꿔버렸다.
         * => 오버로딩을 부모가 아닌 자식 클래스에서 해버림 => LSP 위반, 심지어 코드도 실행이 안됨
         * => 차라리 메소드를 새로 만들어서 사용
         */
    }
}
