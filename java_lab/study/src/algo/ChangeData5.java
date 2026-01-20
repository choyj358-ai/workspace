package algo;

// ChangeData3 {7,4,2,3,1,5,6}
public class ChangeData5 {
    public static void main(String[] args) {
        // Sort 정렬 (오름차순 1,2,3)
        int[] arr = {4,2,3,1};
        int temp;
        // 1회전 (4가 제일 끝으로 감)
        if(arr[0]>arr[1]){
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        if(arr[1]>arr[2]){
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        if(arr[2]>arr[3]){
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        }

        // 2회전 (3이 제일 끝 -1자리로 감)
        if(arr[0]>arr[1]){
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        if(arr[1]>arr[2]){
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }

        // 3회전 (2가 제일 끝 -2자리로 감)
        if(arr[0]>arr[1]){
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}