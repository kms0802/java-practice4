package OPPs.Polymorphism;

class Payment_2 {
    public void pay(int amount) {
        System.out.println("결제 처리 중... " + amount + "원");
    }
}

class CreditCard_2 extends Payment_2 {
    @Override
    public void pay(int amount) {
        System.out.println("신용카드로 " + amount + "원 결제했습니다.");
    }
}

class Cash_2 extends Payment_2 {
    @Override
    public void pay(int amount) {
           System.out.println("현금으로 " + amount + "원 결제했습니다.");
    }
}
public class Polymorphism_2 {
    public static void main(String[]args) {
        Payment_2 p1 = new CreditCard_2();
        Payment_2 p2 = new Cash_2();

        p1.pay(10000);
        p2.pay(5000);
    }
}
