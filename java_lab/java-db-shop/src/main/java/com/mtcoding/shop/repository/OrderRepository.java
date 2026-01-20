package com.mtcoding.shop.repository;

import com.mtcoding.shop.DBConnection;
import com.mtcoding.shop.view.OrderListView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class OrderRepository {
    public int insert(int uId, int pId, int qty, int totalPrice){
        Connection conn = DBConnection.getConnection();
        String  sql = "insert into order_tb(u_id, p_id, qty, total_price) values(?,?,?,?)";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,uId);
            pstmt.setInt(2,pId);
            pstmt.setInt(3,qty);
            pstmt.setInt(4,totalPrice);

            int result = pstmt.executeUpdate();

            return result;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }

    public List<OrderListView> selectJoin(int uId){
        return null;
    }
}
