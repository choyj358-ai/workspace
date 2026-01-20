package ex07;

abstract class Shape{
    int x,y;
    public void translate(int x, int y){
        this.x=x;
        this.y=y;
    }
    public abstract void draw();

}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("사각형 그리기 메소드");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("원 그리기 메소드");
    }
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("삼각형 그리기 메소드");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Shape s1 = new Rectangle();
        s1.draw();
        Shape s2 = new Circle();
        s2.draw();
        Shape s3 = new Triangle();
        s3.draw();
    }
}
