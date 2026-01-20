package com.mtcoding.store;

import java.util.List;

public class StoreApp {

    public static void main(String[] args) {

        StoreRepository repo = new StoreRepository();
        //int result = repo.insert(1,"감자",1000,2);
        //System.out.println("결과 : "+result);

        //int result = repo.updateOne(1,"고구마",2000,100);
        //System.out.println("결과 : "+result);

//        int result = repo.deleteOne(1);
//        System.out.println("결과 : "+result);

//        Store store = repo.selectOne(4);
//        System.out.println(store);

        List<Store> list = repo.selectAll();
        for (Store s : list){
            System.out.println(s);
        }


    }

}
