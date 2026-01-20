package server;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements ProductServiceInterface{

    private ProductRepository repo = new ProductRepository();

    // 메모리 DB 역할
    private List<Product> products = new ArrayList<>();
    private int num = 1; // id 자동 증가용

    // 서버 시작 시 기본 상품 미리 넣어두기
    public ProductService() {
        products.add(new Product(num++, "바나나", 3000, 10));
        products.add(new Product(num++, "사과", 2000, 5));
    }

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

