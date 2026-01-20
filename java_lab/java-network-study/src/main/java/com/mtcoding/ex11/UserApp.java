package com.mtcoding.ex11;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
class User{
    private Integer id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;
    private A company;

    @Getter @Setter
    static class A{ // 내부 클래스 만들 때는 static 붙이기
        private String name;
        private String catchPhrase;
        private String bs;
    }
}

public class UserApp {
    public static void main(String[] args) {
        try{
            // 1. 다운로드 Repository download ()
            Repository repo = new Repository();
            String json = repo.download("https://jsonplaceholder.typicode.com/users/1");

            // 2. 다운로드 확인(디버깅)
            System.out.println(1);

            // 3. User 클래스 완성하기

            // 4. 오브젝트로 변환 (json -> User) - gson필요
            Gson gson = new Gson(); // Gson 함수 사용하려고 입력
            User user = gson.fromJson(json, User.class);

            // 5. 변환 확인
            System.out.println(1);

            // 6. 콘솔에 유저 정보 출력
            System.out.println("id : "+user.getId());
            System.out.println("name : "+user.getName());
            System.out.println("username : "+user.getUsername());
            System.out.println("email : "+user.getEmail());
            System.out.println("phone : "+user.getPhone());
            System.out.println("website : "+user.getWebsite());
            System.out.println("company name : "+user.getCompany().getName());
            System.out.println("company catchPhrase : "+user.getCompany().getCatchPhrase());
            System.out.println("company bs : "+user.getCompany().getBs());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
