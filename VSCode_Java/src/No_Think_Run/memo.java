package No_Think_Run;

public class memo {
    enum Day {
        MONDAY, FRIDAY, SUNDAY, WENDSDAY, TURSDAY, SATURDAY
    }

    enum Season {
        SPRING("봄: 꽃이 피는 계절"),
        SUMMER("여름: 무더운 계절"),
        FALL("가을: 낙엽지는 계절"),
        WINTER("겨울: 눈이 오는 계절");
        
        private String description;

        Season(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[]args) {
        Day today = Day.FRIDAY;

        switch (today) {
            case MONDAY:
                System.out.println("월요일이네");
                break;
            case FRIDAY:
                System.out.println("불금이다");
                break;
            case SUNDAY:
                System.out.println("쉬는날");
                break;
            default:
                System.out.println("오늘도 좋은 하루");
                break;
        }

        for (Season s : Season.values()) {
            System.out.println(s + s.getDescription());
        }
    }
}