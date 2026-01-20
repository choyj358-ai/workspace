package ex04;

public class Television01 {
    private int channel;
    private int volume;
    private boolean onOff;

    Television01(int c, int v, boolean o){
        channel = c;
        volume = v;
        onOff = o;
    }

    void print(){
        System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
    }
}
