package ex04;

import ex04.anno.RequestMapping;
import ex04.anno.RestController;

@RestController
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
    public String select(){
        System.out.println("select 호출됨");
        return "apple";
    }

    @RequestMapping(value = "/login")
    public void login(){
        System.out.println("login 호출됨");
    }


}