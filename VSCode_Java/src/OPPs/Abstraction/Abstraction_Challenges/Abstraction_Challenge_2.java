package OPPs.Abstraction.Abstraction_Challenges;

abstract class Employee {
    protected String name;

    abstract public int calculatePay();
    public void printInfo() {
        System.out.println("이름: " + name + "급여");
    }
}

class FullTimeEmployee extends Employee {
    private int monthlySalary;

    public FullTimeEmployee(String name, int monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public int calculatePay() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, int hourlyWage, int hoursWorked) {
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    public int calculatePay() {
        return hourlyWage * hoursWorked;
    }
}

public class Abstraction_Challenge_2 {
    public static void main(String[]args) {
        Employee e1 = new FullTimeEmployee("김철수", 4000000);
        Employee e2 = new PartTimeEmployee("이영희", 15000, 80);

        e1.printInfo();
        e2.printInfo();
    }
}
