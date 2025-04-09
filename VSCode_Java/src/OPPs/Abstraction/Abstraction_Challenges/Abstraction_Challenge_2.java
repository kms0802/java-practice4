package OPPs.Abstraction.Abstraction_Challenges;

abstract class Employee {
    String name;

    abstract public int calculatePay();
    public void printInfo() {
        System.out.println("이름과 급여 출력");
    }
}

class FullTimeEmployee extends Employee {
    private int monthlySalary;

    public FullTimeEmployee(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getFullTimeEmployee() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(int hourlyWage, int hoursWorked) {
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public int getPartTimeEmployee() {
        return hourlywage, hoursWorked;
    }
}

public class Abstraction_Challenge_2 {
    
}
