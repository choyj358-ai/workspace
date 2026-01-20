package algo;

import java.util.Arrays;
import java.util.Random;

public class LottoApp {
    public static void main(String[] args) {
        //1. 준비
        Random rand = new Random();
        int[] arr = new int[6];

        //2. 로또 번호 받기
        int n;
        boolean isSame;

        for (int k = 0; k < 6; k++) {
            while (true) {
                isSame = false;
                n = rand.nextInt(45) + 1;

                for (int i = 0; i < k; i++) {
                    if (arr[i] == n) {
                        isSame = true;
                    }
                }

                if (!isSame){
                    arr[k] = n;
                    break;
                }
            }
        }
        Arrays.sort(arr);
        for (int a: arr){
            System.out.print(a+" ");
        }


    }
}
