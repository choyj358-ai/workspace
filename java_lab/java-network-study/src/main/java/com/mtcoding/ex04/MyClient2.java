package com.mtcoding.ex04;

import java.io.*;
import java.net.Socket;

public class MyClient2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.0.123",20000); // 서버ip 주소와 포트넘버

            // 키보드로 입력 받을 거임
            InputStream keyStream = System.in;
            InputStreamReader keyReader = new InputStreamReader(keyStream);
            BufferedReader keyBuf = new BufferedReader(keyReader);
            // 쓰기 버퍼
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter ow = new OutputStreamWriter(out);
            BufferedWriter bw = new BufferedWriter(ow);

            while (true){
                String keyboardData = keyBuf.readLine();
                bw.write(keyboardData);
                bw.write("\n"); // 엔터를 의미
                bw.flush();
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
