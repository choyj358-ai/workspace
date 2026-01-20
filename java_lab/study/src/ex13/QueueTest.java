package ex13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            q.add(i);


        }
        System.out.println(q);

        int e = q.remove();
        System.out.println(e);
        System.out.println(q);
    }
}
