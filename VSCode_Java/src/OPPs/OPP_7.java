package OPPs;

class Employee{
    String name;
    String department;
    int salary;

    void introduce() {
        System.out.println("안녕하세요! 저는 " + department + "부서의 " + name + "입니다. ");
    }

    int calculateBonus() {
        return salary / 10;
    }
}

public class OPP_7 {
    public static void main(String[]args) {
        Employee emp1 = new Employee();
        emp1.name = "이서준";
        emp1.department = "게임";
        emp1.salary = 50000000;

        emp1.introduce();
        System.out.println("보너스: " + emp1.calculateBonus() + "원");

        System.out.println();

        Employee emp2 = new Employee();
        emp2.name = "최유진";
        emp2.department = "마케팅";
        emp2.salary = 45000000;

        emp2.introduce();
        System.out.println("보너스: " + emp2.calculateBonus());
    }
}
