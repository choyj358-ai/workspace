package ex08;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar d = Calendar.getInstance();
        System.out.println(d);
        System.out.println(d.get(Calendar.YEAR));
        System.out.println(d.get(Calendar.MONTH)+1);
        System.out.println(d.get(Calendar.DATE));

        d.set(Calendar.HOUR,12);
        d.set(Calendar.MINUTE,34);

    }
}
