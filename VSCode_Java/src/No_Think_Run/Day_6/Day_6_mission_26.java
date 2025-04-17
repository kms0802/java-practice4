package No_Think_Run.Day_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;

public class Day_6_mission_26 {
    public static void main(String[]args) {
        List<String> words = List.of(
            "apple", "banana", "apple", "orange", "banana", "apple", "kiwi", "orange"
        );

        Map<String, Long> result = words.stream()
             .collect(Collectors.groupingBy(
                word -> word, Collectors.counting()
             ));
        System.out.println(result);
    }
}
