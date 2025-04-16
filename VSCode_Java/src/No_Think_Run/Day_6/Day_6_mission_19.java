package No_Think_Run.Day_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;

public class Day_6_mission_19 {
    public static void main(String[]args) {
        List<String> names = List.of("Tom", "Alice", "Bob", "Charlie", "Eve", "Tony", "Amanda");

        Map<Character, List<String>> result = names.stream()
             .collect(Collectors.groupingBy(
                name -> name.charAt(0),
                Collectors.mapping(name -> name.toUpperCase(), Collectors.toList())
             ));

        System.out.println(result);
    }
}
