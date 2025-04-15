package No_Think_Run;

enum Season {
    SPRING("따뜻한 봄"),
    SUMMER("무더운 여름"),
    FALL("시원한 가을"),
    WINTER("추운 겨울");

    private String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class memo {
    public static void main(String[]args) {
        Season s = Season.SUMMER;
        System.out.println(s + ": " + s.getDescription());
    }
}