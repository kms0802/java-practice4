package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Set;

public class Day_6_10 {
    public static void main(String[]args) {
        List<String> animals = List.of("cat,", "dog", "cat", "bird", "dog", "cat");

        Map<String, Long> result = animals.stream()
             .collect(Collectors.groupingBy(
                animal -> animal, Collectors.counting()
             ));
        System.out.println(result);
    }

}