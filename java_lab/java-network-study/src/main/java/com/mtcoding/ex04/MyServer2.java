package com.mtcoding.ex04;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer2 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(20000); // 서버 소켓은 포트가 있어야 함
            Socket socket = ss.accept(); // 누가 연결하면 호출

            // 읽기 버퍼
            InputStream in = socket.getInputStream();
            InputStreamReader ir = new InputStreamReader(in); // 숫자를 문자로 변환
            BufferedReader br = new BufferedReader(ir);

            // while 문 사용
            while (true){
                String line = br.readLine(); // 엔터키까지 읽기
                System.out.println("[server]"+line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
