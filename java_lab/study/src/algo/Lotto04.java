package algo;

import java.util.Random;

public class Lotto04 {
    public static void main(String[] args) {
        //1. 준비
        Random rand = new Random();
        int[] arr = new int[6];

        //2. 로또 번호 받기
        int n;

        //2-1. 첫 번째 추첨 [9][][][][][] -> fix
        while (true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 20
            if (!isSame){
                arr[0] = n;
                break;
            }
        }

        //2-2. 두 번째 추첨 [9][15][][][][]
        while (true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 20
            if (arr[0] == n){
                isSame = true;
            }if (!isSame){
             arr[1] = n;
             break;
            }
        }

        //2-3. 세 번째 추첨 [9][15][20][][][]
        // 9, 9, 15, 15, 20
        while (true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 20
            if (arr[0] == n){
                isSame = true;
            }if (arr[1] == n){
                isSame = true;
            }if (!isSame){
                arr[2] = n;
                break;
            }
        }

        //2-4. 네 번째 추첨 [9][15][20][30][][]
        while (true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 30
            if (arr[0] == n){
                isSame = true;
            }if (arr[1] == n){
                isSame = true;
            }if (arr[2] == n){
                isSame = true;
            }if (!isSame){
                arr[3] = n;
                break;
            }
        }

        //2-5. 다섯 번째 추첨 [9][15][20][30][40][]
        while (true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 40
            if (arr[0] == n){
                isSame = true;
            }if (arr[1] == n){
                isSame = true;
            }if (arr[2] == n){
                isSame = true;
            }if (arr[3] == n){
                isSame = true;
            }if (!isSame){
                arr[4] = n;
                break;
            }
        }

        //2-6. 여섯 번째 추첨 [9][15][20][30][40][43]
        while (true){
            boolean isSame = false;
            n = rand.nextInt(45)+1; // <- 43
            if (arr[0] == n){
                isSame = true;
            }if (arr[1] == n){
                isSame = true;
            }if (arr[2] == n){
                isSame = true;
            }if (arr[3] == n){
                isSame = true;
            }if (arr[4] == n){
                isSame = true;
            }
            if (!isSame){
                arr[5] = n;
                break;
            }
        }
    }
}
