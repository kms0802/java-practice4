package No_Think_Run.Day_12.missions;

public class Day_12_mission_1 {
    public enum Day {
        MONDAY, TUESDAY, WENDSDAY, THUSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[]args) {
        Day today = Day.MONDAY;

        if (today == Day.SATURDAY || today == Day.SUNDAY) {
            System.out.println("오늘은 " + today);
            System.out.println("주말입니다!");
        } else {
            System.out.println("오늘은 " + today);
            System.out.println("평일입니다.");
        }
    }
}
