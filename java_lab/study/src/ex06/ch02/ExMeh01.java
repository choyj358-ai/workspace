package ex06.ch02;

abstract class Car { // 추상적 클래스. new 할 수 없음
    void run(){
    }
//    abstract int getPower();// 추상 메서드. 상태 접근이 안됨
}
class Morning extends Car {
    void run(){
        System.out.println("모닝 달린다");
    }
    int power = 5000;
}
class Sonata extends Car {
    //부모의 메서드를 재정의 하면
    //자식이 부모의 메서드를 오버라이드한다.
    //오버라이드 : 무시하고 대신한다., 부모의 메서드를 무효화시킨다, 상태를 접근한다
    void run(){
        System.out.println("소나타 달린다");
    }
}

public class ExMeh01 {
    public static void main(String[] args) {
        Morning a1 = new Morning(); // Morning(v), Car
        a1.run();

        Car a2 = new Sonata();//sonata, car(v)
        a2.run();

    }
}
