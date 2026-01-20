package ex07;

class 계산기 {
    private void add(){}
    private void minus(){}
    private void multi(){}
    private void divide(){}

    public void 계산하다(String str){
        add();
        minus();
    }
}

// DIP 단일 책임의 원칙 (의존성 역전원칙 - 구체적인것에 의존하지말고 추상적인것에 의존하라)

abstract class 자동차 {
    public abstract void run();
}


class 람보르기니 extends 자동차{
    public void run(){
        System.out.println("람보르기니 달린다.");
    }
}

class M5 extends 자동차{
    public void run(){
        System.out.println("m5 달린다.");
    }
}
class 포르쉐911 extends 자동차{
    public void run(){
        System.out.println("포르쉐911 달린다.");
    }
}

class 레이싱게임 {
    자동차 car1;
    자동차 car2;

    public 레이싱게임(자동차 car1, 자동차 car2) {
        this.car1 = car1;
        this.car2 = car2;
    }

    public void 경주하다(){
        car1.run();
        car2.run();
    }
}



public class MyApp {
    public static void main(String[] args) {
        // 1. 초기화
        자동차 car1 = new M5();
        자동차 car2 = new 포르쉐911();
        자동차 car3 = new 람보르기니();

        레이싱게임 game = new 레이싱게임(car1, car3);

        game.경주하다();
    }
}
