package ex13;

// new 할 때 타입을 결정할 수 있게 해주는 제네릭
class Box2<T>{ // <대문자>
    T data;
}

public class Ge02 {
    public static void main(String[] args) {
        Box2<String> box2 = new Box2(); // <T>의 타입은 Object가 아닌 String 타입으로 지정되었음.
        box2.data = "안녕";
        int len = box2.data.length();
        System.out.println(len);

        Box2<Integer> box3 = new Box2(); //Integer는 클래스.
        box3.data = 5;
        System.out.println(box3.data);
    }
}
