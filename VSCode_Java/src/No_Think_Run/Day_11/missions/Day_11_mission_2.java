package No_Think_Run.Day_11.missions;

public class Day_11_mission_2 {
    public static <T> void compareItems(T a, T b) {
        if (a == b) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }
    }

    public static void main(String[]args) {
        compareItems(1, 1);
    }
}
