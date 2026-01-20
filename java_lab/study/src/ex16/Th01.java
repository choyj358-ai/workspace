package ex16;

class Hello implements Runnable{ //메서드 이름의 규칙이 있음. run

    // sub Thread
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("sub 스레드 : "+i);
        }
        System.out.println("sub 스레드 종료");
    }
}

public class Th01 {
    
    
    //main Thread
    public static void main(String[] args) {
        System.out.println("첫번째실행");
        System.out.println("두번째실행");
        System.out.println("세번째실행");
        Hello hello = new Hello();
        Thread sub = new Thread(hello); // 스레드 객체 만들고
        sub.start(); // run 메서드가 새로운 작업단위가 된다. /스레드 실행/동시성
        for (int i = 0; i < 100; i++) {
            System.out.println("main 스레드 : "+i);
        }
        System.out.println("main 스레드 종료");
    }
}
