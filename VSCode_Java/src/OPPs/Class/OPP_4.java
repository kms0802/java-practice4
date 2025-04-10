package OPPs;

class BankAccount {
    String owner;
    int balance;

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + balance + "원");
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다. ");
        }
    }

    void checkBalance() {
        System.out.println(owner + "님의 현재 잔액은 " + balance + "원입니다.");
    }
}

public class OPP_4 {
    public static void main(String[]args) {
        BankAccount account = new BankAccount();
        account.owner = "이수현";
        account.balance = 0;

        account.deposit(10000);
        account.withdraw(3000);
        account.checkBalance();
    }
}
