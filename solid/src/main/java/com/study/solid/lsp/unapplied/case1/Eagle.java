package com.study.solid.lsp.unapplied.case1;

class Eagle extends Animal {
    String go(int distance, boolean flying) {
        if (flying)
            return distance + "만큼 날아서 갔습니다.";
        else
            return distance + "만큼 걸어서 갔습니다.";
    }
}
