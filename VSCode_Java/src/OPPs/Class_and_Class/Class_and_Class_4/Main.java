package OPPs.Class_and_Class.Class_and_Class_4;

class Employee {
    String name;
    String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void printInfo() {
        System.out.println(name + " ~ " + position);
    }
}

class Company {
    String companyName;
    Employee employee;

    public Company(String companyName, Employee employee) {
        this.companyName = companyName;
        this.employee = employee;
    }

    public void printCompanyInfo() {
        System.out.println("회사명: " + companyName);
        System.out.print("직원: ");
        employee.printInfo();
    }
}

public class Main {
    public static void main(String[]args) {
        Employee emp = new Employee("김철수", "개발자");
        Company com = new Company("코드주식회사", emp);

        com.printCompanyInfo();
    }
}
