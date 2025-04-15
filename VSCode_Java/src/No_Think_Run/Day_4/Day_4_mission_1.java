package No_Think_Run.Day_4;

public class Day_4_mission_1 {
    enum Day {
        MONDAY, TUSdAY, WENDSDAY, TURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[]args) {
        Day today = Day.MONDAY;
        
        switch (today) {
            case MONDAY : 
                System.out.println("월요일이다.");
                break;
            case FRIDAY :
                System.out.println("불금이다!");
                break;
            case SUNDAY :
                System.out.println("쉬자!");
                break;
            default:
                System.out.println("오늘도 파이팅!");
        }
    }
}
