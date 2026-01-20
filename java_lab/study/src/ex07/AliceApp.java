package ex07;

abstract class 판사{
    // 구체적인 행위가 오브젝트마다 다를 때!!
    public abstract void 심문();// 추상 메서드 abstract 가 있으면 {}x
    public void 종료(){ // Q. 모든 판사는 심문을 종료한다.
        System.out.println("심문을 종료한다.");
    }
}
class 왕 extends 판사{ // 판사 is 왕
    public void 심문(){ // 재정의
        System.out.println("왕은 심문한다.");
    }
}
class 왕비 extends 판사{
    public void 심문(){ // 재정의
        System.out.println("왕비는 심문한다.");
    }
}
abstract class 증인{
    public abstract void 대답();
}
class 모자장수 extends 증인{
    public void 대답(){
        System.out.println("모자장수는 대답한다.");
    }
}
class 엘리스 extends 증인{
    public void 대답(){
        System.out.println("엘리스는 대답한다.");
    }
}

public class AliceApp {
    public static void main(String[] args) {
        // 1. 인스턴스 초기화(new)
//        모자장수 c1 = new 모자장수(); // 생성:증인타입-(추상메서드)대답, 모자장수타입-대답
//        엘리스 c2 = new 엘리스();
//        왕 c3 = new 왕();
//        왕비 c4 = new 왕비();

        //추상적인 클래스 명으로 변환
        증인 c1 = new 모자장수();
        증인 c2 = new 엘리스();
        판사 c3 = new 왕();
        판사 c4 = new 왕비();
        //2. 실행
        c1.대답();
        c2.대답();
        c3.심문();
        c3.종료();
        c4.심문();
        c4.종료();

    }
}
