package No_Think_Run;

import java.util.ArrayList;
import java.util.List;

public class Day_1_mission_2 {
    public static void main(String[]args) {
        List<Integer> nums = new ArrayList<>();
        
        int numsum = 0;
        int numslength = 0;

        nums.add(1);
        nums.add(2);
        nums.add(3);

        for (int n : nums) {
            numsum = numsum + n;
            numslength++;
        }
        double numavg = (double) numsum / numslength;

        System.out.println("합계: " + numsum + "평균: " + numavg);
    }
}
