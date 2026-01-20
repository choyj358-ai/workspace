package ex08;

class Service{
    static void loginProcess(String username, String password){
        if (username.length() < 5){
            throw new RuntimeException("username의 길이가 짧아요");
        }
        if (!password.equals("1234")){
            throw new RuntimeException("password가 틀렸어요");
        }
    }
}

// SRP 잘못된 처리를 하는 곳
class Controller{
    static void login(String username, String password){
        try {
            Service.loginProcess(username, password);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}

public class Try03 {
    public static void main(String[] args) {
        try {
            Controller.login("ssar","1234");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
