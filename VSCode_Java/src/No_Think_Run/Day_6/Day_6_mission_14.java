package No_Think_Run.Day_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Day_6_mission_14 {
    public static void main(String[]args) {
        List<String> names = List.of("alice", "bob", "ALICE", "eve", "bob", "david", "EVE");

        Set<String> result = names.stream()
             .map(name -> name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase())
             .collect(Collectors.toSet());

        System.out.println(result);
    }
}
