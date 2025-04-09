package OPPs.Abstraction.Abstraction_Challenges;

abstract class Payment {
    String methodName;
    public Payment(String methodName) {
        this.methodName = methodName;
    }

    public abstract void pay(int amount);
    public void printMethod() {
        System.out.println("결제 수단: " + methodName);
    }
}

class CreditCard extends Payment {
    public CreditCard(String methodName) {
        super(methodName);
    }

    public void pay(int amount) {
        System.out.println("현금으로 [" + amount + "]원 결제합니다.");
    }
}

public class Abstraction_Challenge_6 {
    public static void main(String[]args) {
        Payment p1 = new CreditCard();
        Payment p2 = new Cash();

        p1.printMethod();
        p1.pay(10000);

        p2.printMethod();
        p2.pay(5000);

    }
}
