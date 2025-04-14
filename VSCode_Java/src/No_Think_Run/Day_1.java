package No_Think_Run;

import java.util.ArrayList;
import java.util.List;

public class Day_1 {
    public static void main(String[]args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("포도");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    
        System.out.println("첫 번째 과일: " + fruits.get(0));

        fruits.set(1, "오렌지");

        fruits.remove("포도");

        System.out.println("최종 리스트: " + fruits);
    }
}
