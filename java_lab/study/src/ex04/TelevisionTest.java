package ex04;

public class TelevisionTest {
    public static void main(String[] args) {
        Television01 myTv = new Television01(7, 10, true);
        myTv.print();

        Television01 yourTv = new Television01(11, 20, true);
        yourTv.print();
    }
}
