package No_Think_Run.Day_6;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Day_6_mission_22 {
    public static void main(String[]args) {
        List<String> names = List.of("Tom", "Tony", "Alice", "Amanda", "Bob", "Bobby", "Charlie", "Chloe");

        Map<Character , Set<Integer>> result = names.stream()
             .collect(Collectors.groupingBy(
                name -> name.charAt(0),
                Collectors.mapping(name -> name.length(), Collectors.toSet())
             ));

        System.out.println(result);
    }
}
