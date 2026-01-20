package com.mtcoding.ex06;
//반이중(웹서버)

import com.google.gson.Gson;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class MyClient4 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.0.7",20000); // 서버ip 주소와 포트넘버

            // 쓰기 버퍼
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);

            // 읽기 버퍼
            Scanner socketSc = new Scanner(socket.getInputStream());

            Person person = new Person(1,"홍길동",20, Arrays.asList("축구","농구"));
            Gson gson = new Gson();
            String json = gson.toJson(person);


            pw.println(json); //ln이 \n이 넣어주고, autoFlush 된다
            String recv = socketSc.nextLine();



            System.out.println("서버로부터 받은 메시지 : "+recv);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
