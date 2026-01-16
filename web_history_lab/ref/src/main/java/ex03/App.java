package ex03;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        // 1. 키보드 입력자리
        String uri = "/select";

        // 2. 다른 사람이 만든 코드
        BoardController con = new BoardController();

        // 3. 동적 클래스 분석
        Method[] methods = BoardController.class.getDeclaredMethods();
        for (Method m : methods){
            RequestMapping rm = m.getDeclaredAnnotation(RequestMapping.class);
            if (rm.value().equals(uri)){
                try {
                    m.invoke(con);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }

//            System.out.println(rm);
//            System.out.println(m.getName());
//            System.out.println("------------------");


        }


    }
}
