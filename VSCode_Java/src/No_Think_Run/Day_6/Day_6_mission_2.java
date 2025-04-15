package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;

public class Day_6_mission_2 {
    public static void main(String[]args) {
        List<String> names = List.of("Alice", "Charlie", "David");
        names.stream()
             .filter(name -> name.length() >= 6)
             .forEach(System.out::println);
    }
}
