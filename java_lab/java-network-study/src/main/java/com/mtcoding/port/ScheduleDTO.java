package com.mtcoding.port;

/***
 * https://apis.data.go.kr/1613000/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=8d9ab51b433bdc1456f8facf5381b549ab326b7418bd0f53dbc03b1ca7c1c7a9&pageNo=1&numOfRows=10&_type=json&depAirportId=NAARKJJ&arrAirportId=NAARKPC&depPlandTime=20251220
 */

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ScheduleDTO {

    private Response response;

    @Getter
    @Setter
    public static class Response {
        private Header header;
        private Body body;
    }

    @Getter
    @Setter
    public static class Header {
        private String resultCode;
        private String resultMsg;
    }

    @Getter
    @Setter
    public static class Body {
        private Items items;
        private int numOfRows;
        private int pageNo;
        private int totalCount;
    }

    @Getter
    @Setter
    public static class Items {
        private List<Item> item;
    }

    @Getter
    @Setter
    public static class Item {
        private String airlineNm;
        private String arrAirportNm;
        private long arrPlandTime;     // 202512200955
        private String depAirportNm;
        private long depPlandTime;     // 202512200900

        private Integer economyCharge;   // 없는 경우 null
        private Integer prestigeCharge;  // 없는 경우 null

        private String vihicleId;
    }
}
