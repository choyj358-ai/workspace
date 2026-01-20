package ex03;

/**
 * 동전 종류 : 500, 100, 50, 10 - 4가지 종류
 * money를 입력받아서 1200원
 * 각각의 동전의 최소 개수를 구할예정
 */
public class CoinTest01 {
    public static void main(String[] args) {
        int money = 1270;
        int count;
        int restMoney = money;
        int cm;
        int[] moneys = {500, 100, 50, 10};
        int i = -1;

        // 1. 500원으로 나눠서 개수를 구할거다.
        i++;
        cm = moneys[i];
        count = restMoney/cm; // 2
        restMoney = restMoney % cm; // 270
        System.out.println(cm+"원 개수 : "+count);
        System.out.println("남은 금액 : "+restMoney);

        // 2. 100원으로 나눠서 개수를 구할거다.
        i++;
        cm = moneys[i];
        count = restMoney/cm; // 2
        restMoney = restMoney % cm; // 270
        System.out.println(cm+"원 개수 : "+count);
        System.out.println("남은 금액 : "+restMoney);

        // 3. 50원으로 나눠서 개수를 구할거다.
        i++;
        cm = moneys[i];
        count = restMoney/cm; // 2
        restMoney = restMoney % cm; // 270
        System.out.println(cm+"원 개수 : "+count);
        System.out.println("남은 금액 : "+restMoney);

        // 4. 10원으로 나눠서 개수를 구할거다.
        i++;
        cm = moneys[i];
        count = restMoney/cm; // 2
        restMoney = restMoney % cm; // 270
        System.out.println(cm+"원 개수 : "+count);
        System.out.println("남은 금액 : "+restMoney);
    }
}
