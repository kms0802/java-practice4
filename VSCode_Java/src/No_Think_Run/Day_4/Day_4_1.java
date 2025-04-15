package No_Think_Run.Day_4;

import java.util.ArrayList;
import java.util.List;

public class Day_4_1 {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[]args) {
        Day today = Day.FRIDAY;

        switch (today) {
            case MONDAY:
                System.out.println("월요일은 힘들어...");
                break;
            case FRIDAY:
                System.out.println("불금이다!");
                break;
            case SUNDAY:
                System.out.println("쉬는 날이야");
                break;
            default:
                System.out.println("그냥 평일이네");
        }
    }
}
