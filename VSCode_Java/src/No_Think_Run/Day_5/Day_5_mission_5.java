package No_Think_Run.Day_5;

@FunctionalInterface
interface LengthChecker {
    String check(String text);
}

public class Day_5_mission_5 {
    public static void main(String[]args) {
        LengthChecker isLong = (text)  -> {
            return text.length() >= 5 ? "길다" : "짧다";
        };

        System.out.println("hello -> " + isLong.check("hello"));
        System.out.println("hi -> " + isLong.check("hi"));
    }
}
