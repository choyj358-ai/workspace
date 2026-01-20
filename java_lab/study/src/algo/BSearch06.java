package algo;

import java.util.Arrays;

public class BSearch06 {

    public static void main(String[] args) {

        int[] arr = {5, 4, 1, 2, 3, 0, 7, 6, 8, 9,10}; // 11개 log11 -> 3~4회안에 끝남

        Arrays.sort(arr); // {0,1,2,3,4,5,6,7,8,9,10}

        int target = 6;
        int startIndex = 0; // 0번지
        int endIndex = 10; // 10번지
        int mid = (endIndex - startIndex) / 2;

        if (target == arr[mid]) { // 5번지
            System.out.println(target + "을 찾았습니다(1라운드): " + arr[mid]);
        }

        startIndex = mid+1;
        mid = (endIndex - startIndex) / 2 + startIndex; // 8번지
        if (target == arr[mid]) {
            System.out.println(target + "을 찾았습니다(2라운드): " + arr[mid]);
        }

        //6번지
        endIndex = mid-1; //
        mid = (endIndex - startIndex) / 2 + startIndex; // 6번지
        if (target == arr[mid]) {
            System.out.println(target + "을 찾았습니다(3라운드): " + arr[mid]);
        }

    }
}
