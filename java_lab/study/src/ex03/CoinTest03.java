package ex03;

public class CoinTest03 {
    public static void main(String[] args) {
        int money = 1270;
        int count;
        int restMoney = money;
        int cm;
        int[] moneys = {500, 100, 50, 10};

        for (int j = 0; j < 4; j++) {
            cm = moneys[j];
            count = restMoney/cm; // 2
            restMoney = restMoney % cm; // 270
            System.out.println(cm+"원 개수 : "+count);
            System.out.println("남은 금액 : "+restMoney);
        }
    }
}
