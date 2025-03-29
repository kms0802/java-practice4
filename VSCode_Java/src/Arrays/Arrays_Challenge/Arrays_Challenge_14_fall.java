package Arrays.Arrays_Challenge;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays_Challenge_14_fall {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("몇 개의 정수를 입력하시겠습니까 ? ");
        int input = scanner.nextInt();
        int[] nums = new int[input];
        
        for (int i = 0; i < nums.length; i++){
            System.out.print((i + 1) + "번째 정수 : ");
            nums[i] = scanner.nextInt();
        }
        
        int evenArrayCount = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                evenArrayCount ++;
            }
        }

        int oddArrayCount = 0;
        for (int i = 0; i <nums.length; i++){
            if (nums[i] % 2 != 0){
                oddArrayCount ++;
            }
        }

        int[] evenArray = new int[evenArrayCount];
        int[] oddArray = new int[oddArrayCount];
         
        int evendex = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                evenArray[evendex] = nums[i];
                evendex ++;
            }
        }

        int odddex = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 != 0){
                oddArray[odddex] = nums[i];
                odddex ++;
            }
        }

        System.out.print("짝수로 나열한 배열 : " + Arrays.toString(evenArray) + " \n");
        System.out.print("홀수로 나열한 배열 : " + Arrays.toString(oddArray));
    }
}
