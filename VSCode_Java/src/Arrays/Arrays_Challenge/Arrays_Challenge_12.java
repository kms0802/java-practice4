package Arrays.Arrays_Challenge;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays_Challenge_12 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇개의 정수를 입력하시겠습니까? ");
        int num = scanner.nextInt();

        int[] nums = new int[num];
        int notevensCount = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++){
            System.out.print(nums.length + "개중에서 " + i + "번째 정수 : ");
            nums[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 != 0){
                notevensCount ++;
            }
        }
        
        int[] notevens = new int[notevensCount];

        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 != 0){
                notevens[index] = nums[i];
                index ++;
            }
        }
    System.out.print(Arrays.toString(notevens));
    }
}
