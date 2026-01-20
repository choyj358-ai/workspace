package client;

import com.google.gson.Gson;
import dto.RequestDTO;
import dto.ResponseDTO;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class MyClient {
    public static void main(String[] args) {
        try {
            // 1. Socket(서버) 연결 완료
            Socket socket = new Socket("localhost", 20000);

            // 2. 키보드 입력 버퍼
            InputStream keyStream = System.in;
            InputStreamReader keyReader = new InputStreamReader(keyStream);
            BufferedReader keyBuf = new BufferedReader(keyReader);

            // 3. BW 버퍼 (서버로 보내는)
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter ow = new OutputStreamWriter(out);
            BufferedWriter bw = new BufferedWriter(ow);

            // 4. BR 버퍼 (서버에서 받는)
            InputStream in = socket.getInputStream();
            InputStreamReader ir = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(ir);

            Gson gson = new Gson();

            while(true) {
                // 요청
                System.out.println("입력하시오.");
                String keyboardData = keyBuf.readLine();

                if (keyboardData.equals("exit")){
                    bw.write("exit\n");
                    bw.flush();
                    break;
                }

                // 입력 파싱
                String[] parts = keyboardData.split(" ");
                String method = parts[0];

                Map<String, Integer> querystring = null;
                Map<String, Object> body = null;

                // get, delete 처리
                if (method.equals("get") || method.equals("delete")) {
                    if (parts.length == 2) {
                        int id = Integer.parseInt(parts[1]);

                        querystring = new HashMap<>();
                        querystring.put("id", id);
                    }
                }

                // post
                if ("post".equals(method) && parts.length == 4){
                    body = new HashMap<>();
                    body.put("name",parts[1]);
                    body.put("price",Integer.parseInt(parts[2]));
                    body.put("qty",Integer.parseInt(parts[3]));
                }



                // RequestDTO 생성
                RequestDTO req = new RequestDTO(method,querystring,body);

                // JSON 변환
                String json = gson.toJson(req);

                // 서버로 전송 (json만 보냄)
                bw.write(json + "\n");
                bw.flush();

                // 서버 응답 받기
                String line = br.readLine();
                System.out.println("server : " + line);
            }

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}