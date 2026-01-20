package ex04;

public class People { //p.158 기본 생성자

    private String name; //private : 내 파일 안에서만 변수를 찾을 수 있다
    private int height;
    private int weight;

    People(String name, int height, int weight){ // People: stack, heap / ():(지역변수)
        this.name = name;//초기화코드
        this.height = height;
        this.weight = weight;
    }

    // 상태변경
    public void 밥먹기(){
        weight = weight +2;
    }

    // 상태확인
    public int getWeight(){
        return weight;

    }
}
