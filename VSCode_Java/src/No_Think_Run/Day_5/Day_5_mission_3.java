package No_Think_Run.Day_5;

@FunctionalInterface
interface SignChecker {
    String check(int n);
}

public class Day_5_mission_3 {
    public static void main(String[]args) {
        SignChecker isCheck = (n) -> {
            if (n > 0) return "양수";
            else if (n < 0) return "음수";
            else return "0";
        };

        System.out.println(isCheck.check(5));
    }
}
