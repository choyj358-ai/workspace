package ex03;

/**
 * 동전 종류 : 500, 100, 50, 10 - 4가지 종류
 * money를 입력받아서 1390원
 * 각각의 동전의 최소 개수를 구할예정
 */

public class CoinTest10 {
    public static void main(String[] args) {
        int money = 1390;
        int restmoney = money;
        int count;
        int cm;
        int[] moneys = {500, 100, 50, 10};
        int i = -1;

        //1. 500원으로 나눠서 개수를 구한다.
        i++;
        cm = moneys[i];
        count = restmoney/cm;
        restmoney = restmoney%cm;
        System.out.println(cm+"원 개수는 "+count+"개");
        System.out.println("남은 금액은 "+restmoney+"원");

        //2. 100원으로 나눠서 개수를 구한다.
        i++;
        cm = moneys[i];
        count = restmoney/cm;
        restmoney = restmoney%cm;
        System.out.println(cm+"원 개수는 "+count+"개");
        System.out.println("남은 금액은 "+restmoney+"원");

        //3. 50원으로 나눠서 개수를 구한다.
        i++;
        cm = moneys[i];
        count = restmoney/cm;
        restmoney = restmoney%cm;
        System.out.println(cm+"원 개수는 "+count+"개");
        System.out.println("남은 금액은 "+restmoney+"원");

        //4. 10원으로 나눠서 개수를 구한다.
        i++;
        cm = moneys[i];
        count = restmoney/cm;
        restmoney = restmoney%cm;
        System.out.println(cm+"원 개수는 "+count+"개");
        System.out.println("남은 금액은 "+restmoney+"원");

    }
}
