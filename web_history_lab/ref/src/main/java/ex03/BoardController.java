package ex03;

public class BoardController {

    @RequestMapping("/insert") // value만 사용 시 key값 생략 가능. (value = "/insert")에서 ("/insert")
    public void insert(){
        System.out.println("insert 호출됨");
    }

    @RequestMapping(value = "/delete")
    public void delete(){
        System.out.println("delete 호출됨");
    }

    @RequestMapping(value = "/update")
    public void update(){
        System.out.println("update 호출됨");
    }

    @RequestMapping("/select")
    public void select(){
        System.out.println("select 호출됨");
    }


}