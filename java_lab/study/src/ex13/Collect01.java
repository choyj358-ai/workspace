package ex13;

import java.util.ArrayList;
import java.util.List;

public class Collect01 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList(); // 내부적으로 배열 10칸짜리. [Integer 타입]
        // 1. 추가
        arr.add(1);
        arr.add(3);
        arr.add(5);

        //2. 찾기
        System.out.println(arr.get(2));

        //3. 삭제
        arr.remove(0);
        System.out.println(arr.size());

        //4. contains
        boolean isThree = arr.contains(4); // 배열 안에 4라는 숫자가 있니?
        System.out.println(isThree);

        //5. 배열로 출력
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        for (Integer i : arr){ // (타입 : 배열)
            System.out.println(i);
        }
    }
}
