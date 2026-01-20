package example01;

public class EmpApp {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        int count = 9;

        // 1. 더미로 사원을 10명 만든다. (생성자 유형을 다 써보기)
        Employee e1 = new Employee("홍길동", "0102222");
        Employee e2 = new Employee("장보고", "0105555", "개발팀");
        Employee e3 = new Employee("장보고", "0102222", "인사팀", 3, 1000, "8888", "사원");
        Employee e4 = new Employee("김철수", "0102222", "인사팀",4,3000000,"222-222-222222","대리");
        Employee e5 = new Employee("이영희","0103333");
        Employee e6 = new Employee("아무개","0104444","홍보팀");
        Employee e7 = new Employee("홍길칠","0104545","영업팀",7,5000000,"5454","과장");
        Employee e8 = new Employee("홍길팔","0108888");
        Employee e9 = new Employee("홍길구","0109999","개발팀");
        Employee e10 = new Employee("홍길십","0106464","개발팀");

        // 2. 사원 10명을 employees에 담는다. (배열)
        employees[0]=e1;
        employees[1]=e2;
        employees[2]=e3;
        employees[3]=e4;
        employees[4]=e5;
        employees[5]=e6;
        employees[6]=e7;
        employees[7]=e8;
        employees[8]=e9;
        employees[9]=e10;

        // 3. printInfo 호출 (전체사원)
        for (int i = 0; i < employees.length; i++) {
            employees[i].printInfo();
        }

        // 4. 전체사원의 월급의 합 출력
        int totalMonthSalary =0 ;
        for (int i = 0; i < employees.length; i++) {
            totalMonthSalary = totalMonthSalary + employees[i].getSalary();
        }
        System.out.println(totalMonthSalary);

        // 5. 전체사원의 연봉의 합 출력
        int totalYearSalary = totalMonthSalary * 12;
        System.out.println("기본 연봉 총액 = " + totalYearSalary + "원");

        // 6. 전체사원의 연봉+보너스 출력
        int totalYearSalaryWithBonus=0;
        for (int i = 0; i < employees.length; i++) {
            totalYearSalaryWithBonus = totalYearSalaryWithBonus+employees[i].calcYearSalaryWithBonus() ;
        }
        System.out.println("보너스 포함 연봉 총액 = " + totalYearSalaryWithBonus + "원");

        // 7. 특정 사원 승진 시키기
        for (int i = 0; i < employees.length; i++) {

        }



    }
}
