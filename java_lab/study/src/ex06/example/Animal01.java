package ex06.example;

class Animal{
    void sound(){

    }
    void introduce(){

    }
    void act(){

    }
}
class Dog extends Animal{
    String name;
    Dog(String name){
        this.name = name;
    }
    void introduce(){
        System.out.println("제 이름은 "+name+"입니다.");
    }
    void sound(){
        System.out.println("멍멍!");
    }
    void act(){
        System.out.println("꼬리를 흔든다");
    }
}
class Cat extends Animal{
    String name;
    Cat(String name){
        this.name = name;
    }
    void introduce(){
        System.out.println("제 이름은 "+name+"입니다.");
    }
    void sound(){
        System.out.println("야옹~");
    }
    void act(){
        System.out.println("할퀸다");
    }

}
class Duck extends Animal{
    String name;
    Duck(String name){
        this.name = name;
    }
    void introduce(){
        System.out.println("제 이름은 "+name+"입니다.");
    }
    void sound(){
        System.out.println("꽥꽥!");
    }
    void act(){
        System.out.println("헤엄친다");
    }

}
class Zookeeper{
    void action(Animal a){
        a.introduce();
        a.sound();
        a.act();
    }
}
public class Animal01 {
    public static void main(String[] args) {
        Animal[] ani = new Animal[3];

        ani[0] = new Dog("콩이");
        ani[1] = new Cat("나비");
        ani[2] = new Duck("덕돌이");

        Zookeeper zookeeper = new Zookeeper();

        for (int i = 0; i < 3; i++) {
            zookeeper.action(ani[i]);
        }
    }
}
