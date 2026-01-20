package com.mtcoding.shop.model;

/**
 * user_tb
 */
public class User {
    private Integer uId; // 숫자증가(PK)
    private String uName; // 아이디
    private String uPassword; // 패스워드
    private String uEmail; // 이메일

    public User(Integer uId, String uName, String uPassword, String uEmail) {
        this.uId = uId;
        this.uName = uName;
        this.uPassword = uPassword;
        this.uEmail = uEmail;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }
}
