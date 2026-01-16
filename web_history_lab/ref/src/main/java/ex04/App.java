package ex04;


public class App {

    public static void main(String[] args) throws Exception {
        // 1. 키보드 입력자리
        String uri = "/write";

        // 2. 컴포넌트 스캔
        DispatcherServlet ds = new DispatcherServlet();
        ds.componentScan("ex04");

        // 3. 메서드 호출
        ds.findUri(uri);

    }
}
