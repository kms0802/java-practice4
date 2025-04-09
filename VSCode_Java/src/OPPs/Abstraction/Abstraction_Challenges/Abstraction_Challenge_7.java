package OPPs.Abstraction.Abstraction_Challenges;

abstract class Employee {
    String name;
    int basePay; // 기본급

    public Employee(String name, int basePay) {
        this.name = name;
        this.basePay = basePay;
    }

    public abstract int calculatePay();
    public void printInfo() {
        System.out.println("이름: " + name + "기본급: " + basePay);
    }
}

class Manager extends Employee {
    public Manager(String name, int basePay) {
        super(name, basePay);
    }

    public int calculatePay() {
        basePay = basePay + 1000000;
        return basePay;
    }
}

class PartTimer extends Employee {
    int hoursWorked;
    public PartTimer(String name, int basePay) {
        hoursWorked = super(name, basePay) + this.hoursWorked;
    }

    
}

public class Abstraction_Challenge_7 {
    
}
