package No_Think_Run.Day_11;

public class Day_11_3 {
    public static <T extends Number> void showDoubleValue(T num) {
        System.out.println("두배값: " + (num.doubleValue() * 2));
    }
}
