package No_Think_Run.Day_12;



public class Day_12_1 {
    public enum Day {
        MONDAY, THUSDAY, WENDSDAY
    }

    public static void main(String[]args) {
        Day today = Day.MONDAY;

        if (today == Day.MONDAY) {
            System.out.println("월요일입니다.");
        }

        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
