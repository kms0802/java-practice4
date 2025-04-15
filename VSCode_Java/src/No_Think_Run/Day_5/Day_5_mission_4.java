package No_Think_Run.Day_5;

@FunctionalInterface
interface EvenOddChecker {
    String check(int n);
}

public class Day_5_mission_4 {
    public static void main(String[]args) {
        EvenOddChecker isEven = (n) -> {
            if (n % 2 == 0) {
                return "짝수";
            } else {
                return "홀수";
            }
        };

        System.out.println(isEven.check(7));
    }
}