package com.mtcoding.ex06;
//반이중(웹서버)
import com.google.gson.Gson;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer4 {
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
                Gson gson = new Gson();
                Person p = gson.fromJson(line, Person.class);

                System.out.println(p.getNo());
                System.out.println(p.getName());
                System.out.println(p.getAge());
                System.out.println(p.getHobby().get(0));
                System.out.println(p.getHobby().get(1));

                pw.println("ok");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
