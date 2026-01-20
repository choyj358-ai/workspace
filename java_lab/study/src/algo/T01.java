package algo;

/**
 * 1~100까지의 수에서 2의 배수를 출력하시오.
 * 1) 비즈니스 파악하기
 * 2) 샘플링하기
 * 3) 노가다
 * 4) 패턴찾기
 */
public class T01 {
    public static void main(String[] args) {

        int num = 0;

        for (int i = 0; i < 50; i++) {
            num++;
            System.out.println(2*num);
        }

        num++;
        System.out.println(2*num);
        num++;
        System.out.println(2*num);
        num++;
        System.out.println(2*num);
        num++;
        System.out.println(2*num);
        num++;
        System.out.println(2*num);

    }
}
