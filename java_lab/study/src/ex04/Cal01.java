package ex04;

// add(+), minus(-), multi(*), divide(/)
public class Cal01 {

    static void add(int a, int b){
        System.out.println("a+b="+(a+b));
    }

    static void minus(int a, int b){
        System.out.println("a-b="+(a-b));
    }

    static void multi(int a, int b){
        System.out.println("a*b="+(a*b));
    }

    static void divide(int a, int b){
        System.out.println("a/b="+(a/b));
    }


    public static void main(String[] args) {
        add(3,5);
        minus(3,5);
        multi(3,5);
        divide(3,5);
    }
}