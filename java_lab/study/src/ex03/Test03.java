package ex03;

public class Test03 {
    public static void main(String[] args) {

        //System.out.println(1+2+3+4+5+6+7+8+9+10);

        /*int n = 0;
        int a = 0;

        for (int i = 1; i < 11; i++) {
            //a=a+1;
            n = n +i;
        }

        System.out.println(n);
        */

        /*int sum=0;
        //누적 (sum++, sum = sum+1)

        sum = sum+1;
        sum = sum+2;
        sum = sum+3;
        sum = sum+4;
        sum = sum+5;
        sum = sum+6;
        sum = sum+7;
        sum = sum+8;
        sum = sum+9;
        sum = sum+10;
        System.out.println(sum);

         */

        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}

/*
int sum = 0;
int n = 10;
sum = (n+1) * (n/2);
System.out.println(sum);
 */