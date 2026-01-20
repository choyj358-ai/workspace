package algo;

import java.util.Arrays;

public class BSearch07 {

    public static void main(String[] args) {

        int[] arr = {5, 4, 1, 2, 3, 0, 7, 6, 8, 9,10}; // 11개 log11 -> 3~4회안에 끝남

        Arrays.sort(arr); // {0,1,2,3,4,5,6,7,8,9,10}

        int n =1;
        int target = 10;
        int startIndex = 0; // 0번지
        int endIndex = arr.length-1; // 10번지
        int mid =0; // =0을 빼도 됨

        while(true){
            mid = (endIndex - startIndex) / 2 + startIndex;
            if (target == arr[mid]) { // 5번지
                System.out.println(target + "을 찾았습니다("+n+"라운드): " + arr[mid]);
                break;
            }

            if (target < arr[mid]){
                endIndex = mid-1;
            }
            if (target > arr[mid]){
                startIndex = mid+1;
            }
            n++;
        }





    }
}
