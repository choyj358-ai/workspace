package algo;

public class ChangeData4 {
    public static void main(String[] args) {
        // Sort 정렬 (오름차순) {1,2,3,4,5,6,7}
        int[] arr = {7,4,2,3,1,5,6};
        int temp;
        int a = 0;
        int b = 1;
        int c = arr.length;

        //1회전 (7 제일 끝으로 감)
        for (int i = 0; i < c; i++) {
            if (arr[a]>arr[b])
            {temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;}
            a++;
            b++;
        }

        for (int i = 0; i < c; i++) {
            System.out.print(i);
        }






    }
}
