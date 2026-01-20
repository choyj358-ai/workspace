package jvm;

class Student {
    int no;
    String name;
    int age;
    static String school = "그린아카데미";

    void setNo(int no){
        this.no = no;
    }

    // 상태 확인
    void show(){
        System.out.println(no);
        System.out.println(name);
        System.out.println(age);
        System.out.println(school);
        System.out.println();
    }
}

public class Heap01 {

    static int num = 10;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.no = 1;
        s1.name = "홍길동";
        s1.age = 20;
        s1.show();

        Student s2 = new Student();
        s2.no = 2;
        s2.name = "장보고";
        s2.age = 20;
        s2.show();

        s2.setNo(5);// 장보고 번호 변경
        s2.show();

        System.out.println(Heap01.num);
    }
}
