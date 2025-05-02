package No_Think_Run.Day_11.missions;

public class Day_11_mission_3 {
    public static <T extends Number> void addNumbers(T a, T b) {
        System.out.println("더한 값: " + (a.doubleValue() + b.doubleValue()));
    }

    public static void main(String[]args) {
        addNumbers(12, 13);
    }
}
