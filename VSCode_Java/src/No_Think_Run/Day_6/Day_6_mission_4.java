package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;

public class Day_6_mission_4 {
    public static void main(String[]args) {
        List<String> names = List.of("Tom", "Alice", "Bob", "Charlie", "Eve");

        names.stream() // 스트림 생성
             .filter(name -> name.contains("e")) // e가 포함된것만 contains로
             .forEach(System.out::println); // filter안에 contains에서 걸러진 것들만 출력
    }
}
