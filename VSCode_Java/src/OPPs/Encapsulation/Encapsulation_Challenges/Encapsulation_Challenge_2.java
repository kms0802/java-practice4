package OPPs.Encapsulation.Encapsulation_Challenges;

class Employee {
    private String name;
    private String department;
    private int salary;

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    } 

    public void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("월급은 0부터입니다.");
        }
    }

    public Employee(String name, String department, int salary) {
        setName(name);
        setDepartment(department);
        setSalary(salary);
    }

    void printInfo() {
        System.out.print("직원 정보\n" + "==================\n");
        System.out.print("이름: " + name + "\n");
        System.out.print("부서: " + department + "\n");
        System.out.print("월급: " + salary);
    }
}

public class Encapsulation_Challenge_2 {
    public static void main(String[]args) {
        Employee em = new Employee("비었음", "비었음", 0);
        
        em.setName("김대리");
        em.setDepartment("홍보과");
        em.setSalary(3000000);
        em.printInfo();
        
        Employee em2 = new Employee("비었음","비었음",0);

        em2.setName("박과장");
        em2.setDepartment("데이터과");
        em2.setSalary(5000000);
        em2.printInfo();

        
    }
}
