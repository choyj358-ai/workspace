package ex04.game;

public class GameApp {

    //u1 -> u2를 공격
    static void start(Zealot u1, Dragoon u2){
        u2.hp = u2.hp - u1.attack;
    }

    static void start(Dragoon u1, Zealot u2){ // 오버로딩. 같은 함수이름(start) 부여 가능
        u2.hp = u2.hp - u1.attack;
    }

    static void start(Zealot u1, Zealot u2){
        u2.hp = u2.hp - u1.attack;
    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot();
        Zealot z2 = new Zealot(); // 질럿을 두 개 띄울 때
        Dragoon d1 = new Dragoon();

        start(z1, d1);

        // 1. u1드라군의 상태확인
        System.out.println(d1.hp);

        start(d1, z1);

        // 2. 질럿의 상태확인
        System.out.println(z1.hp);

        start(z1, z2);

        //
        System.out.println(z2.hp);

        System.out.println();
        System.out.println(1);
        System.out.println("");
        System.out.println(1.2);
        System.out.println(true);
    }
}
