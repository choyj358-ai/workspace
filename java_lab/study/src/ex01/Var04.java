package ex01;

// 클래스 자료형
class Dog{
    static int age = 5;
    static String name = "구름이";
    static String color = "노랑";
    static String[] hobby = {"농구", "야구"};
}

public class Var04 {
    public static void main(String[] args) {
        System.out.println(Dog.color);
        System.out.println(Dog.name);
        System.out.println(Dog.hobby[1]);
    }
}
