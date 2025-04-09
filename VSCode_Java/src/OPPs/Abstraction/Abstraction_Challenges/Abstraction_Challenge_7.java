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
        return basePay + 1000000; // 리턴값만 치면 되던거였다.
    }
}

class PartTimer extends Employee {
    int hoursWorked;
    public PartTimer(String name, int basePay, int hoursWorked) { // hoursWorked까지 선언했어야함.
        super(name, basePay);
        this.hoursWorked = hoursWorked; // 슈퍼랑 파트타임이랑 더하는게 아니였음.
    }
    
    @Override
    public int calculatePay() {
        return basePay * hoursWorked;
    }
    
}

public class Abstraction_Challenge_7 {
    public static void main(String[]args) {
        Employee e1 = new Manager("김과장", 3000000);
        Employee e2 = new PartTimer("이알바", 10000, 120);

        e1.printInfo();
        System.out.println("실급여: " + e1.calculatePay());

        e2.printInfo();
        System.out.println("실급여: " + e2.calculatePay());
    }
}
