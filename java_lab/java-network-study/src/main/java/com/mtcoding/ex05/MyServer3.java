package com.mtcoding.ex05;
//반이중(웹서버)
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer3 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(20000); // 서버 소켓은 포트가 있어야 함
            Socket socket = ss.accept(); // 누가 연결하면 호출

            // 읽기 버퍼
            Scanner sc = new Scanner(socket.getInputStream());

            // 쓰기 버퍼
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);

            // while 문 사용
            while (true){
                String line = sc.nextLine(); // 엔터키까지 읽기
                System.out.println("[server]"+line);
                pw.println("ok");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
