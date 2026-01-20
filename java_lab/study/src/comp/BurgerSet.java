package comp;

/**
 * 1. is 상속 - extends
 * 2. can do 인터페이스
 * 3. has 결합(Composition) - 상태로 가지면 됨.
 */

public class BurgerSet {
    private Burger burger;
    private Coke coke;
    private Potato potato;


    public BurgerSet(Burger burger, Coke coke, Potato potato) {
        this.burger = burger;
        this.coke = coke;
        this.potato = potato;
        System.out.println("버거세트가 만들어졌어요.");
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public Potato getPotato() {
        return potato;
    }

    public int getTotalPrice(){
        int totalPrice = burger.getPrice() +coke.getPrice() + potato.getPrice();
        totalPrice = (int)(totalPrice * 0.9);
        return totalPrice;
    }



}
