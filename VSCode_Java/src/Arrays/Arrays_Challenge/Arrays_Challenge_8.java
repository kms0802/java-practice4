package Arrays.Arrays_Challenge;

import java.util.Scanner;

public class Arrays_Challenge_8 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        int[] nums = new int[5];
        int sum = 0;
        System.out.print("정수 5개 입력\n");
        for (int i = 0; i < nums.length; i++){
            System.out.print((i + 1) + "번째: ");
            nums[i] = scanner.nextInt();
            
            sum = sum + nums[i];
        }

        int max = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        int min = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < min){
                min = nums[i];
            }
        }
        System.out.print("최댓값은 : " + max + "\n");
        System.out.print("최솟값은 : " + min + "\n");
        System.out.print("합계 : " + sum + "\n");

        double ave = (double)sum / nums.length;
        System.out.print("평균 : " + ave);

        scanner.close();
    }
}
