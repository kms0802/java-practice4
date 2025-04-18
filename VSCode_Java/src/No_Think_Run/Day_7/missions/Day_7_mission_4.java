package No_Think_Run.Day_7.missions;

import java.util.Scanner;

public class Day_7_mission_4 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        try {int[] nums = {5, 10, 15, 20, 25};
        

        int select = scanner.nextInt();
        System.out.println(nums[select]);
    
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("배열 정상범위 아님");
    } finally {
        System.out.println("프로그램 종료");
       scanner.close();
    }
        
    }
}
