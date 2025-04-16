package No_Think_Run.Day_6;

import java.util.Set;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day_6_mission_23 {
    public static void main(String[]args) {
        List<String> words = List.of(
            "apple", "ant", "banana", "ball", "bat", "cat", "carrot", "cup", "dog", "doll", "elephant"
        );

        Map<Integer , Set<Character>> result = words.stream()
             .collect(Collectors.groupingBy(
                word -> word.length(), // 단어의 기준으로
                Collectors.mapping(word -> word.charAt(0), Collectors.toSet())
                                            // 첫 글자만 추출해서, 중복 없이 저장
             ));
        System.out.println(result);
    }
}
