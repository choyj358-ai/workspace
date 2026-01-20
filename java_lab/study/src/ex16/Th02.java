package ex16;

public class Th02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 200; i++) {
                System.out.println("서브 스레드 : "+i);
            }
        });
        t1.start();



        for (int i = 0; i < 200; i++) {
            System.out.println("메인 스레드 : "+i);
        }
    }
}
