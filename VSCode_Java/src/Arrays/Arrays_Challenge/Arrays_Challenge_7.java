package Arrays.Arrays_Challenge;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays_Challenge_7 {
    public static void main(String[]args){
        int[] scores = new int[5];
        
        int sum = 0;
        System.out.print("정수를 입력해주세요. \n");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++){
            System.out.print((i + 1) + "번재 정수 입력: ");
            scores[i] = scanner.nextInt();
            sum = sum + scores[i];
        }
        double ave = (double) sum / scores.length;
        
        System.out.print("합계는 : " + sum);
        System.out.println("");
        System.out.print("평균은 : " + ave);
        scanner.close();
    }
}
