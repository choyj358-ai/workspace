package server;

import com.google.gson.Gson;
import dto.RequestDTO;
import dto.ResponseDTO;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

public class MyServer {
    public static void main(String[] args) {
        try {
            // 1. 20000번 포트로 대기 중...
            ServerSocket ss = new ServerSocket(20000);
            Socket socket = ss.accept();

            // 2. 새로운 소켓에 버퍼(반이중) 달기
            // 클 -> 서 (읽고BR)
            InputStream in = socket.getInputStream();
            InputStreamReader ir = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(ir);
            // 서 -> 클 (쓰고BW)
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter ow = new OutputStreamWriter(out);
            BufferedWriter bw = new BufferedWriter(ow);

            Gson gson = new Gson();

            ProductService productService = new ProductService();

            while(true){
                // 1. client로부터 받은 메시지
                String line = br.readLine(); // 엔터키까지 읽기

                if (line == null) {
                    System.out.println("클라이언트 연결 끊김");
                    break;
                }
                if (line.equals("exit")){
                    System.out.println("클라이언트 종료 요청");
                    break;
                }

                System.out.println("[서버] 받은 요청 : "+line);

                // 2. 파싱 (json String -> object)
                RequestDTO req = gson.fromJson(line, RequestDTO.class);

                // 요청 정보 꺼내기
                String method = req.getMethod();
                Map<String, Integer> querystring = req.getQuerystring();
                Map<String, Object> body = req.getBody();

                System.out.println("[server] method: " + req.getMethod());
                System.out.println("[server] query: " + req.getQuerystring());
                System.out.println("[server] body: " + req.getBody());

                ResponseDTO<?> res; // 응답 개체

                // 3. 서비스 호출 (ex. 상품 상세) if or reflection

                try {
                    if ("get".equals(method)) {
                        if (querystring != null
                            && querystring.containsKey("id")
                            && req.getBody() == null){
                            // 상품 상세
                            int id = querystring.get("id");
                            Product product = productService.상품상세(id);
                            res = new ResponseDTO<>("ok",product);
                        } else if ((querystring == null || querystring.isEmpty())
                                && req.getBody() == null) {
                            // 상품 목록
                            res = new ResponseDTO<>("ok",productService.상품목록());
                        } else {
                            res = new ResponseDTO<>("처리할 수 없는 get 요청", null);
                        }
                    } else if ("post".equals(method)) {
                        // 상품 등록
                        if (req.getBody() != null
                                && req.getBody().get("name") != null
                                && req.getBody().get("price") != null
                                && req.getBody().get("qty") != null) {

                            String name = (String) req.getBody().get("name");
                            int price = ((Number) req.getBody().get("price")).intValue();
                            int qty = ((Number) req.getBody().get("qty")).intValue();

                            productService.상품등록(name, price, qty);
                            res = new ResponseDTO<>("ok", null);
                        } else {
                            res = new ResponseDTO<>("등록 정보 부족", null);
                        }
                    } else if ("delete".equals(method)) {
                        // 상품 삭제
                        if (querystring != null && querystring.containsKey("id")) {
                            int id = querystring.get("id");
                            productService.상품삭제(id);
                            res = new ResponseDTO<>("ok", null);
                        } else {
                            res = new ResponseDTO<>("삭제할 id 없음", null);
                        }
                    } else {
                        res = new ResponseDTO<>("지원하지 않는 요청", null);
                    }

                } catch (Exception e) {
                    res = new ResponseDTO<>(e.getMessage(), null);
                }


                // 4. 응답
                String resJson = gson.toJson(res);

                bw.write(resJson + "\n");
                bw.flush();

                System.out.println(resJson);

            }

            socket.close();
            ss.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}