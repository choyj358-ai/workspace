package ex04;

public class Burger {

    String 재료1;
    String 재료2;
    String 재료3;
    int price;

    // 기본생성자
    Burger(){
        재료1 = "불고기";
        재료2 = "양상추";
        재료3 = "빵";
        price = 3800;
    }

    Burger(String 재료1, int price){
        this.재료1 = 재료1;
        재료2 = "양상추";
        재료3 = "빵";
        this.price = price;
    }




    public static void main(String[] args) {
        Burger b1 = new Burger();
        Burger b2 = new Burger();
        Burger b3 = new Burger();
        Burger b4 = new Burger();
        Burger b5 = new Burger();
        Burger b6 = new Burger();

        Burger b7 = new Burger("새우", 4000);
        Burger b8 = new Burger("한우불고기", 8000);
        Burger b9 = new Burger();

    }
}