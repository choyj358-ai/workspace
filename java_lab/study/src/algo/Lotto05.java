package algo;

import java.util.Random;

public class Lotto05 {
    public static void main(String[] args) {
        //1. 준비
        Random rand = new Random();
        int[] arr = new int[6];

        //2. 로또 번호 받기
        int n;
        int k = 0;

        //2-1. 첫 번째 추첨 [9][][][][][] -> fix
        while (true) {
            boolean isSame = false;
            n = rand.nextInt(45) + 1; // <- 43
            int i = 0;

            for (int j = 0; j < k; j++) {
                if (arr[i] == n) {
                    isSame = true;
                }
                i++;
            }

            if (!isSame){
                arr[5] = n;
                break;
            }

        }
        k++;
        //2-2. 두 번째 추첨 [9][15][][][][]
        while (true) {
            boolean isSame = false;
            n = rand.nextInt(45) + 1; // <- 43
            int i = 0;

            for (int j = 0; j < k; j++) {
                if (arr[i] == n) {
                    isSame = true;
                }
                i++;
            }

            if (!isSame){
                arr[5] = n;
                break;
            }

        }
        k++;
        //2-3. 세 번째 추첨 [9][15][20][][][]
        // 9, 9, 15, 15, 20
        while (true) {
            boolean isSame = false;
            n = rand.nextInt(45) + 1; // <- 43
            int i = 0;

            for (int j = 0; j < k; j++) {
                if (arr[i] == n) {
                    isSame = true;
                }
                i++;
            }

            if (!isSame){
                arr[5] = n;
                break;
            }

        }
        k++;
        //2-4. 네 번째 추첨 [9][15][20][30][][]
        while (true) {
            boolean isSame = false;
            n = rand.nextInt(45) + 1; // <- 43
            int i = 0;

            for (int j = 0; j < k; j++) {
                if (arr[i] == n) {
                    isSame = true;
                }
                i++;
            }

            if (!isSame){
                arr[5] = n;
                break;
            }
        }
        k++;
        //2-5. 다섯 번째 추첨 [9][15][20][30][40][]
        while (true) {
            boolean isSame = false;
            n = rand.nextInt(45) + 1; // <- 43
            int i = 0;

            for (int j = 0; j < k; j++) {
                if (arr[i] == n) {
                    isSame = true;
                }
                i++;
            }

            if (!isSame){
                arr[5] = n;
                break;
            }
        }
        k++;
        //2-6. 여섯 번째 추첨 [9][15][20][30][40][43]
        while (true) {
            boolean isSame = false;
            n = rand.nextInt(45) + 1; // <- 43
            int i = 0;

            for (int j = 0; j < k; j++) {
                if (arr[i] == n) {
                    isSame = true;
                }
                i++;
            }

            if (!isSame){
                arr[5] = n;
                break;
            }
        }


    }
}
