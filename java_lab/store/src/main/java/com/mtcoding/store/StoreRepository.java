package com.mtcoding.store;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Store Table DB 전담반
public class StoreRepository {

    // (개념)Read = (DB)select = (http)get
    public List<Store> selectAll(){
        Connection conn = DBConnection.getConnection();

        try {
            String sql = "select * from store_tb order by id desc";
            PreparedStatement pstmt = conn.prepareStatement(sql); // 버퍼에 sql 담기

            // 조회해서 view로 응답받기
            ResultSet rs = pstmt.executeQuery(); // executeQuery : select

            // 행이 존재하면 프로젝션(열 선택하기)
            List<Store> list = new ArrayList<>();
            while (rs.next()){
                // rs -> 자바오브젝트로 파싱
                int c1 = rs.getInt("id");
                String c2 = rs.getString("name");
                int c3 = rs.getInt("price");
                int c4 = rs.getInt("qty");
                Store store = new Store(c1,c2,c3,c4);
                list.add(store);
            } // {스택}
            return list;


        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;

    }

    // Read = select = get
    public Store selectOne(int id){
        Connection conn = DBConnection.getConnection();

        try {
            String sql = "select * from store_tb where id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql); // 버퍼에 sql 담기
            pstmt.setInt(1,id);

            // 조회해서 view로 응답받기
            ResultSet rs = pstmt.executeQuery(); // executeQuery : select

            // 커서를 한칸 밑으로 내림
            boolean isRow = rs.next();

            // 행이 존재하면 프로젝션(열 선택하기)
            if (isRow){
                int c1 = rs.getInt("id");
                String c2 = rs.getString("name");
                int c3 = rs.getInt("price");
                int c4 = rs.getInt("qty");
                Store store = new Store(c1,c2,c3,c4);
                return store;
            } // {스택}


        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;

    }

    // (Write - )Delete = delete = delete
    public int deleteOne(int id){

        // 1. DBMS와 연결된 소켓
        Connection conn = DBConnection.getConnection();

        String sql = "delete from store_tb where id=?";
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

    // (Write - )Update = update = put
    public int updateOne(int id, String name, int price, int qty){

        // 1. DBMS와 연결된 소켓
        Connection conn = DBConnection.getConnection();

        String sql = "update store_tb set name=?, price=?, qty=? where id=?";
        try {
            // 2. 버퍼 달기
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
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

    // (Write - )Create = insert = post
    public int insert(int id, String name, int price, int qty){

        // 1. DBMS와 연결된 소켓
        Connection conn = DBConnection.getConnection();

        String sql = "insert into store_tb(id, name, price, qty) values(?,?,?,?)";
        try {
            // 2. 버퍼 달기
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            pstmt.setString(2,name);
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
}
