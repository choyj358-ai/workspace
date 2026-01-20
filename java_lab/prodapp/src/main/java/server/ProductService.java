package server;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements ProductServiceInterface{

    private ProductRepository repo = new ProductRepository();

    // 메모리 DB 역할
    private List<Product> products = new ArrayList<>();


    @Override
    public void 상품등록(String name, int price, int qty) {
        try {
            repo.insert(name,price,qty);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> 상품목록() {
        try {
            return repo.findAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product 상품상세(int id) {
        Product product = repo.findById(id);
        if (product == null){
            throw new RuntimeException("처리할 수 없는 get 요청");
        }
        return product;
    }

    @Override
    public void 상품삭제(int id) {
        try {
            Product p = repo. findById(id);
            if (p==null) throw new RuntimeException("삭제할 id 없음");
            repo.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

