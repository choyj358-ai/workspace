package comp;

public class Coke {
    private String name;
    private int price;

    public Coke(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println(name+"가 만들어졌어요");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Coke{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
