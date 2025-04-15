package No_Think_Run.Day_4;

enum Day {
    MONDAY,TUESDAY,FRIDAY;


}

public class Day_4_mission_6 {
    public static void main(String[]args) {
        Day day = Day.MONDAY;

        switch (day) {
            case MONDAY:
                System.out.println("월요일");
                break;
            case TUESDAY:
                System.out.println("화요일");
                break;
            case FRIDAY:
                System.out.println("불금이야");
                break;
            default:
                System.out.println("오늘도 힘내보자");
        }
    }
}
