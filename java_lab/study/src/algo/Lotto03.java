package algo;

import java.util.Random;

public class Lotto03 {
    public static void main(String[] args) {
        //1. 준비
        Random rand = new Random();
        int[] arr = new int[6];

        //2. 로또 번호 받기
        int n;

        //2-1. 첫 번째 추첨 [9][][][][][] -> fix
        n = rand.nextInt(45)+1;
        arr[0] = n;

        //2-2. 두 번째 추첨 [9][15][][][][]
        while (true){
            n = rand.nextInt(45)+1; // <- 9
            if (arr[0] != n){
                arr[1] = n;
                break;
            }
        }




        //2-3. 세 번째 추첨 [9][15][20][][][]
        n = rand.nextInt(45)+1;
        arr[2] = n;

        //2-4. 네 번째 추첨 [9][15][20][30][][]
        n = rand.nextInt(45)+1;
        arr[3] = n;

        //2-5. 다섯 번째 추첨 [9][15][20][30][40][]
        n = rand.nextInt(45)+1;
        arr[4] = n;

        //2-6. 여섯 번째 추첨 [9][15][20][30][40][43]
        n = rand.nextInt(45)+1;
        arr[5] = n;
    }
}
