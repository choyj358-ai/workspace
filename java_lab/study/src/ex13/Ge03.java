package ex13;

/**
 * Object로 설계할 수 밖에 없는 이유
 */

// 싱글톤 패턴
class 서랍{

    Object data;

    public static 서랍 instance = new 서랍();

    private 서랍(){ // private으로 new 못해서

    }

}

public class Ge03 {
    public static void main(String[] args) {
        서랍 s = 서랍.instance; // .instance main 시작 전에 한번만 띄웠구나
        s.data = "안녕";

        // 다운캐스팅
        String castData = (String)s.data;
        int len = castData.length();
        System.out.println(len);
    }
}
