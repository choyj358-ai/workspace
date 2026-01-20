package algo;

import java.util.Arrays;

// 찾기
public class BSearch03 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 1, 2, 3, 0, 11};

        //1. 정렬
        Arrays.sort(arr);// {0, 1, 2, 3, 4, 10, 11}
        int target = 11;
        int mid = arr.length/2; // 3

        //2. 검색
        if (target == arr[mid]) { // {0, 1, 2, [3], 4, 10, 11}, 11 == 3 F
            System.out.println(target+"를 찾았습니다.");
            return; // 복기. if문의 true 라면 main 종료
        }
        if (target > arr[mid]){ // 11>10 T
            mid = 5; // 3->5
        }

        if (target < arr[mid]){ // 11<1 F
            mid = 1; // 3->1
        }

        if (target == arr[mid]){ // 0, 1, 2, 3, 4, [10], 11 / 11 = 10 F
            System.out.println(target+"를 찾았습니다.");
            return;
        }

        if (target > arr[mid]){ // 11>11
            mid = 6; //5->6
        }

        if (target < arr[mid]){ // 11<4
            mid = 4; //5->4
        }

        if (target == arr[mid]){ // 0, 1, 2, 3, 4, 10, [11]
            System.out.println(target+"를 찾았습니다.");
            return;
        }


        System.out.println("main끝");

    }
}
