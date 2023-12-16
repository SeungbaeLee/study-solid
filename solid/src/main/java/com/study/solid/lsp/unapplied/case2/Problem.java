package com.study.solid.lsp.unapplied.case2;

import java.util.ArrayList;
import java.util.List;

public class Problem extends Animal{
    List<Animal> animalList = new ArrayList<>();

    void  speakAll() {
        animalList.add(new Cat());
        animalList.add(new Dog());
        animalList.add(new Fish());//예외가 던져짐

        for(Animal a : animalList) {
            a.legs();
        }
    }
}
/**
 * 예시가 억지 같지만 어떠한 기능을 구현하려 할 때,
 * 부모의 메서드의 의도대로 하지 않고(이 코드에선 다리의 갯수를 더하려고 했으나 Fish 클래스를 맡은 개발자의 단독적인 생각으로 0을 던질 수 있음에도 예외처리)
 * 자식 클래스에서 예외처리를 하게된다. => 자식 클래스가 부모 클래스를 대체하기 위해서는 부모 클래스에 대한 클라이언트의 가정을 준수해야 하는것을 어김
 * 협업 과정에서의 문제가 생길수가 있다.
 */
