package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;

public class Day_6_mission_7 {
    public static void main(String[]args) {
        List<String> names = List.of("Tom", "Alice", "Bob", "Charlie", "Eve");
        names.stream()
             .filter(name -> name.length() >= 4)
             .map(name -> name.toUpperCase())
             .forEach(System.out::println);
             
    }
}
