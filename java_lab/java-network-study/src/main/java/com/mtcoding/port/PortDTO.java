package com.mtcoding.port;

/***
 * https://apis.data.go.kr/1613000/DmstcFlightNvgInfoService/getArprtList?serviceKey=8d9ab51b433bdc1456f8facf5381b549ab326b7418bd0f53dbc03b1ca7c1c7a9&_type=json
 */

// DTO -> Data Transfer Object

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PortDTO {

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
    }

    @Getter
    @Setter
    public static class Items {
        private List<Item> item;
    }

    @Getter
    @Setter
    public static class Item {
        private String airportId;
        private String airportNm;
    }
}

