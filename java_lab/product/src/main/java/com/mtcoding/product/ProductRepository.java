package com.mtcoding.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductRepository {

    // insert
    public int insert(int id, String pname, int price, int qty){

        // 1. DBMS와 연결된 소켓
        Connection conn = DBConnection.getConnection();

        String sql = "insert into product_tb(id, pname, price, qty) values(?,?,?,?)";
        try {
            // 2. 버퍼 달기
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            pstmt.setString(2,pname);
            pstmt.setInt(3,price);
            pstmt.setInt(4,qty);

            // 3. 쿼리 전송
            int result = pstmt.executeUpdate();

            return result;

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return -1;


    }
    // update
    public int updateOne(int id, String pname, int price, int qty){

        // 1. DBMS와 연결된 소켓
        Connection conn = DBConnection.getConnection();

        String sql = "update product_tb set pname=?, price=?, qty=? where id=?";
        try {
            // 2. 버퍼 달기
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,pname);
            pstmt.setInt(2,price);
            pstmt.setInt(3,qty);
            pstmt.setInt(4,id);

            // 3. 쿼리 전송
            int result = pstmt.executeUpdate();

            return result;

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return -1;


    }
    // delete
    public int deleteOne(int id){

        // 1. DBMS와 연결된 소켓
        Connection conn = DBConnection.getConnection();

        String sql = "delete from product_tb where id=?";
        try {
            // 2. 버퍼 달기
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);

            // 3. 쿼리 전송
            int result = pstmt.executeUpdate();

            return result;

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return -1;


    }


}
