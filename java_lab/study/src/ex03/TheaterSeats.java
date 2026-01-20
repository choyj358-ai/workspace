package ex03;

public class TheaterSeats {
    public static void main(String[] args) {
        int[][]seats = {{0,0,0,1,1,0,0,0,0,0},
                        {0,0,1,1,0,0,0,0,0,0},
                        {0,0,0,0,0,0,1,1,1,0}};
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                count += seats[i][j];
            }
        }
        System.out.println("현재 관객 수는 "+count+  "명입니다.");
    }
}
