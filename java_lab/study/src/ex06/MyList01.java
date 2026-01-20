package ex06;

class Node {
    String key;
    String value;
    Node next;

    public Node(String key, String value, Node next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class MyList01 {
    public static void main(String[] args) {
        // 1. 첫번째 노드
        Node n1 = new Node("name", "홍길동", null);

        // 2. 두번째 노드
        Node n2 = new Node("age", "11", null);
        n1.setNext(n2);

        // 3. 세번째 노드
        Node n3 = new Node("weight", "50", null);
        n2.setNext(n3);

        //4. n2 삭제하기
        //n1 -> next = n2
        //삭제 : n1 -> next = n3 (setter 사용)
        n1.setNext(n3);



        System.out.println(n1.value);
        System.out.println(n1.next.value);
        System.out.println(n1.next.next.value);
    }
}