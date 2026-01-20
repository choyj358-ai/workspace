package ex06.example;

class Shape{
    void draw(){

    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("원을 그립니다");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("사각형을 그립니다");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("삼각형을 그립니다");
    }
}


public class Shape01 {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Triangle();

        shape[0] = s1;
        shape[1] = s2;
        shape[2] = s3;


        for (Shape n : shape){
            n.draw();
        }

    }
}
