package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Day_6_mission_10 {
    public static void main(String[]args) {
        List<String> names = List.of("Tom", "Alice", "Bob", "Charlie", "Eve", "Daniel");

        List<Integer> result = names.stream()
             .map(name -> name.length())
             .filter(length -> length >= 5)
             .collect(Collectors.toList());
        System.out.println(result);
    }
}
