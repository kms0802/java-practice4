package No_Think_Run.Day_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;

public class Day_6_mission_25 {
    public static void main(String[]args) {
        List<String> fruits = List.of(
            "apple", "apricot", "banana", "blueberry", "blackberry", 
    "cherry", "coconut", "date", "dragonfruit", "elderberry"
        );

        Map<Integer , Set<Character>> result = fruits.stream()
             .collect(Collectors.groupingBy(
                fruit -> fruit.length(),
                Collectors.mapping(fruit -> fruit.charAt(0), Collectors.toSet())
             ));
        
             System.out.println(result);
    }
}
