package No_Think_Run.Day_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Set;

public class Day_6_mission_20 {
    public static void main(String[]args) {
        List<String> names = List.of("Tom", "Alice", "Bob", "Charlie", "Eve", "Tony", "Amanda");

        Map<Character, List<Integer>> result = names.stream()
             .collect(Collectors.groupingBy(
                name -> name.charAt(0),
                Collectors.mapping(name -> name.length(), Collectors.toList())
             ));

        System.out.println(result);

       
    }
}
