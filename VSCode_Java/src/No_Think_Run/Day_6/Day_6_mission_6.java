package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;

public class Day_6_mission_6 {
    public static void main(String[]args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "Eve");
        names.stream()
             .map(name -> name.length())
             .forEach(System.out::println);
    }
}
