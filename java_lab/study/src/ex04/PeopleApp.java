package ex04;

// OOP : Object Oriented Programing
// 1원칙 : 상태는 행위를 통해 변경한다.
// 상태는 private을 입력 - 행위로만 변경되도록
// 행위(메서드)는 public 입력
public class PeopleApp { // public : 다른 패키지에서도 변수를 찾을 수 있음
    public static void main(String[] args) {
        People people1 = new People("홍길동",30,5);
        People people2 = new People("장보고",20,3);

        people1.밥먹기();//메서드(상태변경) (메서드는 시간이 변할수록 값이 변하는 것<->생성자)
        people1.밥먹기();
        System.out.println(people1.getWeight());

    }
}
