package com.mtcoding.shop.model;

/**
 * cart_tb
 */
public class Cart {
    private Integer cId;  // 숫자증가(PK)
    private Integer uId; // 장바구니에 담은 유저 ID
    private Integer pId; // 장바구니에 담은 상품 ID
    private Integer qty; // 장바구니에 담은 상품 개수

    public Cart(Integer cId, Integer uId, Integer pId, Integer qty) {
        this.cId = cId;
        this.uId = uId;
        this.pId = pId;
        this.qty = qty;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}
