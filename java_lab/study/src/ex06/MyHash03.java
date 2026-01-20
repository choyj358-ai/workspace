package ex06;

public class MyHash03 {
    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C'};

        int h = 0;

        // 1. 문자를 숫자로 바꾼다
        int n = arr[0]; // 65

        h = h * 31 + n; // h=65

        // 2.
        n = arr[1];
        h = h * 31 + n; // h=2081

        // 3.
        n = arr[2];
        h = h * 31 + n;

        System.out.println(h);
    }
}
