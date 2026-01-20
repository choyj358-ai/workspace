package example01;

public class Employee {
    //1. 상태만들기 + getter, setter
    //2. 생성자 만들기 (오버로딩)
    private String name;
    private String phone;
    private String dept;
    private int empNo;
    private int salary;
    private String account;
    private String position;

    Employee(String name, String phone){
        this.name = name;
        this.phone = phone;
        dept = "미정";
        empNo = 0;
        salary = 0;
        account = "";
        position = "사원";
    }

    Employee(String name, String phone,String dept){
        this.name = name;
        this.phone = phone;
        this.dept = dept;
        empNo = 0;
        salary = 0;
        account = "";
        position = "사원";
    }

    Employee(String name, String phone,String dept,int empNo, int salary, String account, String position){
        this.name = name;
        this.phone = phone;
        this.dept = dept;
        this.empNo = empNo;
        this.salary = salary;
        this.account = account;
        this.position = position;
    }

    public void printInfo(){
        System.out.println(name +" / "+phone+" / "+dept+" / 사원번호: "+empNo+" / 직급: "+position+" / 월급: "+salary+" / 계좌: "+account);
    }

    public int calcYearSalary(){
        return salary*12;
    }

    public int calcYearSalaryWithBonus(){
        if (position.equals("사원")){
            return (int)(calcYearSalary()*1.1);
        }
        if (position.equals("대리")){
            return (int)(calcYearSalary()*1.2);
        }
        if (position.equals("과장")){
            return (int)(calcYearSalary()*1.3);
        }
        if (position.equals("부장")){
            return (int)(calcYearSalary()*1.4);
        }
        return calcYearSalaryWithBonus();
    }



//-------------------------------------------
    public void setEmpNo(int empNo){
        this.empNo = empNo;
    }
    public int getEmpNo(){
        return empNo;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }

    public void setDept(String dept){
        this.dept = dept;
    }
    public String getDept(){
        return dept;
    }

   public void setSalary(int salary){
        this.salary = salary;
   }
   public int getSalary(){
        return salary;
   }

    public void setAccount(String account){
        this.account = account;
    }
    public String getAccount(){
        return account;
    }

    public void setPosition(String position){
        this.position = position;
    }
    public String getPosition(){
        return position;
    }






}
