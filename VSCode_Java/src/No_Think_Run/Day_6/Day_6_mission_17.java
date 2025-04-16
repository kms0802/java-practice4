package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class Day_6_mission_17 {
    public static void main(String[]args) {
        List<String> names = List.of("tom", "alice", "bob", "charlie", "eve", "daniel");

        String result = names.stream()
             .filter(name -> name.length() >= 4)
             .map(name -> name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase())
             .collect(Collectors.joining(" / "));

        System.out.println(result);
    }
}
