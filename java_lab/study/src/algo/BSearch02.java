package algo;

import java.util.Arrays;

//4 찾기
public class BSearch02 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 1, 2, 3, 8, 6};

        //1. 정렬
        Arrays.sort(arr);// {1,2,3,4,6,8,10}
        int target = 4;
        int mid = arr.length/2;

        //2. 검색
        if (target == arr[mid]) {
            System.out.println(target+"를 찾았습니다.");
        }


        System.out.println("main끝");

    }
}
