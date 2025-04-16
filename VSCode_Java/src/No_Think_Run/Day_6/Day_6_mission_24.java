package No_Think_Run.Day_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;

public class Day_6_mission_24 {
    public static void main(String[]args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7,  8, 9, 10);

        Set<Integer> result = numbers.stream()
             .filter(number -> number % 2 == 0)
             .map(number -> number * number)
             .collect(Collectors.toSet());

        System.out.println(result);
    }
}
