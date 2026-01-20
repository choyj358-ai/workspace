package com.mtcoding.ex05;
//반이중(웹서버)
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class MyClient3 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.0.7",20000); // 서버ip 주소와 포트넘버

            // 키보드로 입력 받을 거임
            Scanner sc = new Scanner(System.in);

            // 쓰기 버퍼
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);

            // 읽기 버퍼
            Scanner socketSc = new Scanner(socket.getInputStream());

            while (true){
                String keyboardData = sc.nextLine();
                pw.println(keyboardData); //ln이 \n이 넣어주고, autoFlush 된다
                String recv = socketSc.nextLine();
                System.out.println("서버로부터 받은 메시지 : "+recv);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
