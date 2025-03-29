package Arrays.Arrays_Challenge;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays_Challenge_13 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("몇개의 정수를 입력하시겠습니까 ? ");
        int input = scanner.nextInt();
        int[] nums = new int[input];
        int index = 0;
        int sum = 0;
        int notevensCount = 0;
        for (int i = 0; i < nums.length; i++){
            System.out.print((i + 1) + "번째 정수 : ");
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

        for (int i = 0; i < notevens.length; i++){
            sum = sum + notevens[i];
        }
        
        double avg = (double) sum / index;
        int max = notevens[0];
        for (int i = 0; i < notevens.length; i++){
            if (notevens[i] > max){
                max = notevens[i];
            }
        }

        System.out.print("홀수들의 합계 : " + sum + "\n");
        System.out.print("평균 : " + avg + "\n");
        System.out.print("최댓값 : " + max + "\n");
    }
}
