package ex03;

public class Test05 {
    public static void main(String[] args) {
        //3행 space2, star1
        //4행 space3, star1
        //5행 space4, star1
        String space = " ";
        String star = "*";
        int row = 5;
        int n1 = row-1;
        int n2 = 1;

        for (int k = 0; k < row; k++) {
            for (int i = 0; i < n1; i++) {
                System.out.print(space);
            }
            for (int i = 0; i < n2; i++) {
                System.out.print(star);
            }
            System.out.println();
            n1--;
            n2++;
        }


    }
}
