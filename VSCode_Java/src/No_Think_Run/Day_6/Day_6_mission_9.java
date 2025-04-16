package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Day_6_mission_9{
    public static void main(String[]args) {
        List<String> names = List.of("Tom", "Alice", "Bob", "Charlie", "Eve", "Daniel");

        List<String> result = names.stream()
             .filter(name -> name.length() >= 5)
             .map(name -> name.toUpperCase())
             .collect(Collectors.toList());

        System.out.println(result);
    }
}
