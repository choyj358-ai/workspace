package dto;

import java.util.Map;

public class RequestDTO {
    private String method; // get, delete, post
    private Map<String, Integer> querystring; // id
    private Map<String, Object> body; // name, price, qty

    public RequestDTO() {}
    // 기본 생성자

    public RequestDTO(String method, Map<String, Integer> querystring, Map<String, Object> body) {
        this.method = method;
        this.querystring = querystring;
        this.body = body;
    }

    // getter, setter
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, Integer> getQuerystring() {
        return querystring;
    }

    public void setQuerystring(Map<String, Integer> querystring) {
        this.querystring = querystring;
    }

    public Map<String, Object> getBody() {
        return body;
    }

    public void setBody(Map<String, Object> body) {
        this.body = body;
    }

    // toString
    @Override
    public String toString() {
        return "RequestDTO{" +
                "method='" + method + '\'' +
                ", querystring=" + querystring +
                ", body=" + body +
                '}';
    }
}
