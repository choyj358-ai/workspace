package ex13;

//Object의 장단점
class Box {
    Object data;
}

public class Ge01 {
    public static void main(String[] args) {
        Box box = new Box(); // Box라는 상자와 Object 라는 상자가 생김
        box.data = "안녕";

        String castData = (String) box.data ;
        int len = castData.length();
        System.out.println(len);
    }
}
