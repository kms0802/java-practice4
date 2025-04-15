package No_Think_Run.Day_4;

public class Day_4_2 {
    enum Season {
        SPRING("따뜻한 봄"),
        SUMMER("무더운 여름"),
        FALL("풍성한 가을"),
        WINTER("추운 겨울");

        private String description;

        Season(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[]args) {
        for (Season s : Season.values()) {
            System.out.println(s + ": " + s.getDescription());
        }
    }
}
