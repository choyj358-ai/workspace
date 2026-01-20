package com.mtcoding.shop.model;

/**
 * order_tb
 */
public class Order {
    private Integer oId; // 숫자증가(PK)
    private Integer uId; // 주문한 유저 ID
    private Integer pId; // 주문한 상품 ID
    private Integer qty; // 주문한 상품 개수
    private Integer totalPrice; // 총 금액

    public Order(Integer oId, Integer uId, Integer pId, Integer qty, Integer totalPrice) {
        this.oId = oId;
        this.uId = uId;
        this.pId = pId;
        this.qty = qty;
        this.totalPrice = totalPrice;
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
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

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
}
