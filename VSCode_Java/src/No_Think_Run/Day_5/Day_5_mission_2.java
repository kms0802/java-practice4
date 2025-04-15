package No_Think_Run.Day_5;

@FunctionalInterface
interface Checker {
    boolean check(int n);
}

public class Day_5_mission_2 {
    public static void main(String[]args) {
        Checker isEven = (n) -> n % 2 == 0;

        System.out.println("7은 짝수인가요? " + isEven.check(7));
        System.out.println("10은 짝수인가요? " + isEven.check(10));
    }
}
