package algo;

import java.util.Random;

public class LottoApp02 {
    public static void main(String[] args) {
        int count= 0;
        boolean a= true;
        int[] arr = new int[6];
        Random r = new Random();
        int n;

        //1. 랜덤 숫자를 생성함
        n = r.nextInt(45)+1;
        System.out.println(n);



        //2. 랜덤 숫자가 배열에 없다면 넣는다.\
        if (arr[0] == n){
            a= false;
        }if (arr[1] == n){
//            arr[1]이랑 n이랑 다르면 실행
        }if (arr[2] == n){
//            arr[2]이랑 n이랑 다르면 실행
        }if (arr[3] == n){
//            arr[3]이랑 n이랑 다르면 실행
        }if (arr[4] == n){
//            arr[4]이랑 n이랑 다르면 실행
        }if (arr[5]  == n){
//            arr[5]이랑 n이랑 다르면 실행
        }


        if(a){
            arr[0] = n;
        }




        /**
         * 1. 랜덤 숫자를 생성함
         * 2. 랜덤 숫자가 배열에 없다면 넣는다.
         * 3. arr[count] = 랜덤숫자
         * 카운트를 1증가 시킨다.
         *
         * 3. 랜덤 숫자가 배열에 존재함
         * 카운트 증가시키지 않음
         *
         *
         *
         */




        // 중복 발생 되지 않도록 설계



    }
}
