package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class Day_6_mission_13 {
    public static void main(String[]args) {
        List<String> numbers = List.of("1", "2", "3", "2", "3", "4", "5", "5", "6");

        Set<Integer> result = numbers.stream()
             .map(s -> Integer.parseInt(s))
             .filter(n -> n % 2 == 0)
             .collect(Collectors.toSet());

        System.out.println(result);
    }
}
