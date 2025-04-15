package No_Think_Run.Day_6;

import java.util.List;
import java.util.ArrayList;

public class Day_6_mission_3 {
    public static void main(String[]args) {
        List<String> names = List.of("Tom", "Alice", "Bob", "Charlie", "Eve");
        names.stream() // 스트림 생성
             .filter(name -> name.length() >= 5) // 글자 수가 5 이상인 이름만 남김
             .forEach(System.out::println); // 출력
    }
}
