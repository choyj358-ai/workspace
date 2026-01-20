package dto;

import java.util.Map;

public class ResponseDTO<T> {
// <T> : 오브젝트{} 일 수도 있고, arraylist[] 일 수도 있다 제네릭
    private String msg; // ok, error 메시지
    private T body;

    public ResponseDTO(String msg, T body) {
        this.msg = msg;
        this.body = body;
    }

    public String getMsg() {
        return msg;
    }

    public T getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "msg='" + msg + '\'' +
                ", body=" + body +
                '}';
    }
}
