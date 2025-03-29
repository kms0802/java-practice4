package Arrays.Arrays_Challenge;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays_Challenge_15 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇개의 정수를 입력하시겠습니까 ? ");
        int input = scanner.nextInt();
        int[] nums = new int[input];

        for (int i = 0; i < nums.length; i++){
            System.out.print((i + 1) + "번째 정수 입력 : ");
            nums[i] = scanner.nextInt();
        }

        int evenArraysCount = 0;
        int oddArraysCount = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                evenArraysCount ++;
            } else oddArraysCount ++;
        }

        int[] evenArray = new int[evenArraysCount];
        int[] oddArray = new int[oddArraysCount];
        int evendex = 0;
        int odddex = 0;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                evenArray[evendex] = nums[i];
                evenSum = evenSum + evenArray[evendex];
                evendex ++;
            } else{
                oddArray[odddex] = nums[i];
                oddSum = oddSum + oddArray[odddex];
                odddex ++;
            }
        }

        System.out.print(Arrays.toString(evenArray) + "\n");
        System.out.print(Arrays.toString(oddArray) + "\n");
        System.out.println(evenSum + " " + oddSum);
        System.out.println("");
        double evenAvg = (double) evenSum / evenArray.length;
        double oddAvg = (double) oddSum / oddArray.length;

        System.out.print("짝수의 평균 : " + evenAvg + "\n");
        System.out.print("홀수의 평균 : " + oddAvg + "\n");

        if (evenAvg > oddAvg){
            System.out.println("짝수의 평균이 높습니다.");
        } else if(evenAvg < oddAvg){
            System.out.println("홀수의 평균이 높습니다.");
        } else{
            System.out.println("두수의 평균은 같습니다.");
        }
    }
}
