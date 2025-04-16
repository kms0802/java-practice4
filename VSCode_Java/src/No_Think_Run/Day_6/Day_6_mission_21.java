package No_Think_Run.Day_6;

import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day_6_mission_21 {
    public static void main(String[]args) {
        List<String> names = List.of("Alice", "Amanda", "Bob", "alice", "bob", "Charlie", "charlie");

        Map<Character, Set<String>> result = names.stream()
             .collect(Collectors.groupingBy(
                name -> Character.toLowerCase(name.charAt(0)),
                Collectors.mapping(name -> name.toLowerCase(), Collectors.toSet())
             ));

        System.out.println(result);
    }
}
