package ex02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        // 1. 키보드 입력자리
        String uri = "/join";

        // 2. 다른 사람이 만든 코드
        uri = uri.replace("/","");

        BoardController con = new BoardController();

        // 3. 동적 클래스 분석
        Method[] methods = BoardController.class.getDeclaredMethods();
        for (Method m : methods){
//            System.out.println(m);
//            System.out.println(m.getName());
            try {
                if (m.getName().equals(uri)){
                    m.invoke(con);
                }

            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
