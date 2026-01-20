package ex06;

class Data{ // class Data extends Object { /적지 않아도 생성되어 있음
    int num;

    public  Data(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

public class MyHash extends Object{
    public static void main(String[] args) {
        Data d1 = new Data(1); // 상태는 같고, 주소는 다름
        Data d2 = new Data(1); // 상태는 같고, 주소는 다름
        Data d3 = d1; // 얕은 복사(주소만 복사)

        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());

        if (d1.hashCode() == d2.hashCode()){
            System.out.println("같은 주소에 있는 객체");
        }else {
            System.out.println("다른 주소에 있는 객체");
        }

        if(d1.num == d2.num){
            System.out.println("값이 같습니다.");
        }else {
            System.out.println("값이 다릅니다.");
        }

        if (d1.hashCode() == d3.hashCode()){
            System.out.println("같아요 얕은 복사 됐어요");
        }else {
            System.out.println("달라요 new가 된 다른 주소 같아요");
        }

    }
}
