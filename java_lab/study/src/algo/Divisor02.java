package algo;

/**
 * 12의 약수를 출력하시오!
 * 1) 비지니스 이해 (12를 1~12 다 나눠서 나누어떨어지면 약수)
 * 2) 샘플링. 6의 약수 구하기
 * 3) 노가다
 * 4) 패턴 찾기
 */
public class Divisor02 {
    public static void main(String[] args) {
        int n = 12;

        for (int i = 0; i < 12; i++) {
            if (12%n==0){
                System.out.print(n+", ");
            }
            n--;
        }





    }
}
