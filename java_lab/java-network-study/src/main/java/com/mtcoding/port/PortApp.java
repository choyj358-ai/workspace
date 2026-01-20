package com.mtcoding.port;

import com.google.gson.Gson;

public class PortApp {
    public static void main(String[] args) {
        try {
            // 1. 공항 정보 다운로드 (완)
            PortRepository repo = new PortRepository();
            String portJson = repo.download("https://apis.data.go.kr/1613000/DmstcFlightNvgInfoService/getArprtList?serviceKey=8d9ab51b433bdc1456f8facf5381b549ab326b7418bd0f53dbc03b1ca7c1c7a9&_type=json");
            System.out.println(1);
            // 2. portDTO에 파싱
            Gson gson = new Gson();
            PortDTO port = gson.fromJson(portJson, PortDTO.class);
            System.out.println(2);
            // 3. HashMap에 옮기기
            // 4. 출발지(김해), 목적지(김포), 출발시간(20251220) 키보드로 입력받기
            // 5. 해시맵에서 김해 -> value, 김포 -> value
            // 6. 항공 스케줄 다운로드
            // 7. ScheduleDTO에 파싱
            // 8. 항공 스케줄 출력
        } catch (Exception e) {
            e.printStackTrace();
        }





    }
}
