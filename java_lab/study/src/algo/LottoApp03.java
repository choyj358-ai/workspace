package algo;

import java.util.Random;

public class LottoApp03 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();
        int n;

        n = r.nextInt(45)+1; // 1~45
        if (arr[0] != n && arr[1] != n && arr[2] != n && arr[3] != n && arr[4] != n && arr[5] != n) {
            arr[0] = n;}
        System.out.println(n);

        n = r.nextInt(45)+1;
        if (arr[0] != n && arr[1] != n && arr[2] != n && arr[3] != n && arr[4] != n && arr[5] != n) {
            arr[1] = n;}
        System.out.println(n);

        n = r.nextInt(45)+1;
        if (arr[0] != n && arr[1] != n && arr[2] != n && arr[3] != n && arr[4] != n && arr[5] != n) {
            arr[2] = n;}
        System.out.println(n);

        n = r.nextInt(45)+1;
        if (arr[0] != n && arr[1] != n && arr[2] != n && arr[3] != n && arr[4] != n && arr[5] != n) {
            arr[3] = n;}
        System.out.println(n);

        n = r.nextInt(45)+1;
        if (arr[0] != n && arr[1] != n && arr[2] != n && arr[3] != n && arr[4] != n && arr[5] != n) {
            arr[4] = n;}
        System.out.println(n);

        n = r.nextInt(45)+1;
        if (arr[0] != n && arr[1] != n && arr[2] != n && arr[3] != n && arr[4] != n && arr[5] != n) {
            arr[5] = n;}
        System.out.println(n);



    }
}

