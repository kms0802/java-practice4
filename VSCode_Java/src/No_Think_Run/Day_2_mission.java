package No_Think_Run;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class Day_2_mission {
    public static void main(String[]args) {
        HashSet<String> pro = new HashSet<>();
        HashMap<String, Integer> person = new HashMap<>();

        pro.add("java");
        pro.add("python");
        pro.add("java");
        pro.add("c++");

        person.put("홍길동", 23);
        person.put("김철수", 31);
        person.put("이영희", 27);

        System.out.println(pro);

        System.out.println(person);

        
    }
}
