package algo;

/**
 * 1~100까지의 수에서 2의 배수를 출력하시오.
 * 1) 비즈니스 파악하기
 * 2) 샘플링하기
 * 3) 노가다
 * 4) 패턴찾기
 */
public class T02 {
    public static void main(String[] args) {
        int n = 1;
        String result = "아닙니다";

        for (int i = 0; i < 100; i++) {
            if (n%2==0 ){
                result="맞습니다";
            }else {
                result="아닙니다";
            }
            System.out.println(n+"은 2의 배수가 "+ result);
            n++;
        }

        // 1일때
        if (n%2==0 ){
            result="맞습니다";
        }else {
            result="아닙니다";
        }
        System.out.println(n+"은 2의 배수가 "+ result);
        n++;

        // 2일때
        if (n%2==0 ){
            result="맞습니다";
        }else {
            result="아닙니다";
        }
        System.out.println(n+"은 2의 배수가 "+ result);
        n++;

        // 3일때
        System.out.println(n+"은 2의 배수가 "+ result);
        n++;

        // 4일때
        System.out.println(n+"은 2의 배수가 "+ result);
        n++;

        // 5일때
        System.out.println(n+"은 2의 배수가 "+ result);
        n++;
        System.out.println(n+"은 2의 배수가 "+ result);
        n++;

    }
}
