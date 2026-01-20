package ex08.ch02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExamTry {

    int[] arr;

    public ExamTry() {
        this.arr = new int[3];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
    }

    void searchArr(int index) {
        System.out.println("찾으시는 배열 공간의 값은 : " + arr[index]);
    }

    public static void main(String[] args) {

        ExamTry examTry = new ExamTry();
        Scanner sc = new Scanner(System.in);
        System.out.println("찾고 싶은 배열의 index를 입력하세요");
        while (true){
            int index = sc.nextInt();

            try {
                examTry.searchArr(index);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("[0~2]까지 입력가능합니다");
            }


        }
    }
}
