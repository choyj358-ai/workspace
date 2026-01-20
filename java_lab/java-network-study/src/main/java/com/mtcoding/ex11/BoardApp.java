package com.mtcoding.ex11;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
class Common {
    private Integer status;
    private String msg;
    private List<BB> body;

    @Getter @Setter
    static class BB{
        private Integer id;
        private String title;
        private String content;
        private String author;
    }
}

public class BoardApp {
    public static void main(String[] args) {
        // 1. try - catch
        try {
            // 2. 다운로드
            Repository rep = new Repository();
            String json = rep.download("http://192.168.0.99:8080/api/boards");

            // 3. 확인
            //System.out.println(111111);

            // 4. common 클래스 작성, 게터, 세터

            // 5. json에서 오브젝트로 변환
            Gson gson = new Gson();
            Common cc = gson.fromJson(json, Common.class);

            // 6. 확인
            //System.out.println(22222);

            // 7. 출력
            System.out.println(cc.getStatus());
            System.out.println(cc.getMsg());

            // 7-1. body 리스트 출력
            List<Common.BB> body = cc.getBody();
            for (int i = 0; i < body.size(); i++) {
                Integer a = body.get(i).getId();
                System.out.println(a);
                String b = body.get(i).getTitle();
                System.out.println(b);
                String c = body.get(i).getContent();
                System.out.println(c);
                String d = body.get(i).getAuthor();
                System.out.println(d);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
