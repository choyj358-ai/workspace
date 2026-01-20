package server;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    Connection conn = DBConnection.getConnection();

    // 1. insert(String name, int price, int qty) 상품 등록
    public void insert(String name, int price, int qty) throws SQLException {
        String sql = "insert into product(name, price, qty) values(?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,name);
        ps.setInt(2,price);
        ps.setInt(3,qty);
        ps.executeUpdate();
    }

    // 2. deleteById(int id) 상품 삭제
    public void deleteById(int id) throws SQLException {
        String sql = "delete from product where id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,id);
        ps.executeUpdate();
    }

    // 3. findById(int id) 상품 상세
    public Product findById(int id){
        try {
            String sql = "select * from product where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                return new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("price"),
                        rs.getInt("qty")
                );
            }
            return null;

        } catch (Exception e) {
            throw new RuntimeException("DB 조회 실패",e);
        }
    }

    // 4. findAll() 상품 목록
    public List<Product> findAll() throws SQLException {
        String sql = "select * from product";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        List<Product> list = new ArrayList<>();
        while (rs.next()){
            list.add(new Product(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("price"),
                    rs.getInt("qty")
            ));
        }
        return list;
    }
}
