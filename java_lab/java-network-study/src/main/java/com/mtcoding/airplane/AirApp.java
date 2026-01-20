package com.mtcoding.airplane;

import com.google.gson.Gson;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AirApp {

    // key = 무안, value = NAARKJB
    static Map<String, String> ports = new HashMap<>();


    public static void main(String[] args) {
        // 1. 공항정보를 다운 - HttpUrlConnection으로!!
        try {
            String site1 = "https://apis.data.go.kr/1613000/DmstcFlightNvgInfoService/getArprtList?serviceKey=8d9ab51b433bdc1456f8facf5381b549ab326b7418bd0f53dbc03b1ca7c1c7a9&_type=json";
            URL url1 = new URL(site1);
            HttpURLConnection conn1 = (HttpURLConnection) url1.openConnection();
            conn1.setRequestMethod("GET");
            Scanner sc1 = new Scanner(conn1.getInputStream());
            String json1 = "";
            while (sc1.hasNextLine()){
                String line = sc1.nextLine();
                json1 = json1 + line;
            }
            System.out.println(json1);

            // 2. PortInfo로 오브젝트화 시켜!!
            Gson gson = new Gson();
            PortInfo portInfo = gson.fromJson(json1, PortInfo.class);

            // 3. ports에 airportId에 있는 값, airportNm에 있는 값을 넣기
            List<PortInfo.Response.Body.Items.Item> airportId = portInfo.getResponse().getBody().getItems().getItem();

            for (int i = 0; i < airportId.size(); i++) {
                String temp1 = airportId.get(i).getAirportNm();
                String temp2 = airportId.get(i).getAirportId();
                AirApp.ports.put(temp1,temp2);
            }
            System.out.println(ports);

            String dep = ""; // 무안
            String depKey = "";
            String arr = ""; // 부산
            String arrKey = "";
            String time = ""; // 20251219
            // 4. 스캐너로 출발지를 받기
            Scanner keyboard = new Scanner(System.in);
            System.out.println("출발지를 입력하시오.");
            dep = keyboard.nextLine();
            depKey = ports.get(dep);
            System.out.println("depKey : "+depKey);


            // 5. 스캐너로 목적지를 받기
            System.out.println("목적지를 입력하시오.");
            arr = keyboard.nextLine();
            arrKey = ports.get(arr);
            System.out.println("arrKey : "+arrKey);


            // 6. 스캐너로 날짜를 받기
            System.out.println("날짜를 입력하시오.");
            time = keyboard.nextLine();


            // 7. 동적인 URL 만들기
            String site2 = """
                https://apis.data.go.kr/1613000/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=8d9ab51b433bdc1456f8facf5381b549ab326b7418bd0f53dbc03b1ca7c1c7a9&pageNo=1&numOfRows=10&_type=json&depAirportId=${depKey}&arrAirportId=${arrKey}&depPlandTime=${time}
                """.replace("${depKey}",depKey).replace("${arrKey}",arrKey).replace("${time}",time);
            // 8. 항공스케줄 다운 HttpUrlConnection 호출
            URL url2 = new URL(site2);
            HttpURLConnection conn2 = (HttpURLConnection) url2.openConnection();
            conn2.setRequestMethod("GET");
            Scanner sc2 = new Scanner(conn2.getInputStream());
            String json2 = "";
            while (sc2.hasNextLine()){
                String line = sc2.nextLine();
                json2 = json2 + line;
            }
            System.out.println(json2);


            // 9. 파싱 -> AirInfo로 파싱
            AirInfo airInfo = gson.fromJson(json2, AirInfo.class);



            // 10. 항공 스케줄 예쁘게 전체 출력 ->
            List<AirInfo.Response.Body.Items.Item> air = airInfo.getResponse().getBody().getItems().getItem();

            for (int i = 0; i < air.size(); i++) {
                String aa = air.get(i).getAirlineNm();
                System.out.println(aa);
                String bb = air.get(i).getArrAirportNm();
                System.out.println(bb);
                Long cc = air.get(i).getArrPlandTime();
                System.out.println(cc);
                String dd = air.get(i).getDepAirportNm();
                System.out.println(dd);
                Long ee = air.get(i).getDepPlandTime();
                System.out.println(ee);
                Integer ff = air.get(i).getEconomyCharge();
                System.out.println(ff);
                Integer gg = air.get(i).getPrestigeCharge();
                System.out.println(gg);
                String hh = air.get(i).getVihicleld();
                System.out.println(hh);
                System.out.println();
            }





        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
