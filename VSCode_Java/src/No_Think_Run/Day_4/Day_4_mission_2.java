package No_Think_Run.Day_4;

public class Day_4_mission_2 {
    enum Season {
        SPRING("봄: 꽃이 피는 계절"),
        SUMMER("여름: 무더운 계절"),
        FALL("가을: 낙엽지는 계절"),
        WINTER("겨울: 눈이오는 계절");

        private String description;

        Season(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public static void main(String[]args) {
            for (Season s : Season.values()) {
                System.out.println(s + ": " + s.getDescription());
            }
        }
    }
}
