package com.mtcoding.product;

public class ProductApp {
    public static void main(String[] args) {

        ProductRepository repo = new ProductRepository();
//        int result = repo.insert(1,"책상",10000,20);
//        System.out.println("결과 : "+result);

//        repo.insert(2,"의자",5000,20);
//        repo.insert(3,"모니터",20000,10);
//        repo.insert(4,"마우스",8000,15);

//        repo.updateOne(1,"키보드",9000,13);

        repo.deleteOne(4);
    }

}
