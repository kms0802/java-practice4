package OPPs.Encapsulation;

public class Encapsulation_2 {
    public static void main(String[]args) {
        Account acc = new Account("김민수", 10000);

        acc.deposit(5000);
        acc.withdraw(3000);

        System.out.println("예금주: " + acc.getOwner());
        System.out.println("현재 잔액: " + acc.getBalance());
    }
}
