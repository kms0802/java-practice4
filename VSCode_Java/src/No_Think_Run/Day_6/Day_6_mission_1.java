package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;

public class Day_6_mission_1 {
    public static void main(String[]args) {
        List<String> names = List.of("Alice", "Charlie", "David");
        names.stream()
             .forEach(System.out::println);
    }
}
