package ex06.game;

public class GameApp {

    //u1 -> u2를 공격
    static void start(Protoss u1, Protoss u2){
       // u2.hp = u2.hp - u1.attack;
        int remainHp = u2.getHp() - u1.getAttack();
        u2.setHp(remainHp);
    }


    public static void main(String[] args) {
        Zealot z1 = new Zealot();
        Zealot z2 = new Zealot(); // 질럿을 두 개 띄울 때
        Dragoon d1 = new Dragoon();

        start(z1, d1);

        // 1. u1드라군의 상태확인
        System.out.println(d1.getHp());

        start(d1, z1);

        // 2. 질럿의 상태확인
        System.out.println(z1.getHp());

        start(z1, z2);

        //
        System.out.println(z2.getHp());

        System.out.println();
        System.out.println(1);
        System.out.println("");
        System.out.println(1.2);
        System.out.println(true);
    }
}
