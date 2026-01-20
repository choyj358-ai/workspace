package ex08.ch01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckTry02 {
    //예상 불가능한 익셉션 코드 (RuntimeException)
    static void m1(int n){
        try {
            int result = 10/n;
            System.out.println(result);
        } catch (RuntimeException e) {
            System.out.println("0");;
        }
    }
    //예상 가능한 익셉션 코드 (RuntimeException이 아닌 모든 것)
    static void m2(){
        try {
            FileInputStream fis = new FileInputStream("파일명");
        } catch (FileNotFoundException e) {
            System.out.println("파일명 못찾았어요!! 다시 시도해");
        }

    }

    public static void main(String[] args) {
        m1(0);
        m2();
    }
}
