package com.study.solid.lsp.unapplied.case2;

class Fish extends Animal {
    void legs() {//0을 출력값으로 보낼 수 있으나, 협업 중 한 개발자의 혼자만의 생각으로 예외 처리
        try {
            throw new Exception("물고기는 다리가 없음");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
