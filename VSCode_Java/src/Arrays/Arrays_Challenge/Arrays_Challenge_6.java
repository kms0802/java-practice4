package Arrays.Arrays_Challenge;

import java.util.Scanner;

import java.util.Arrays;

public class Arrays_Challenge_6 {
    public static void main(String[]args){
        
        

        Scanner scanner = new Scanner(System.in);
        
        int[] scores = new int[5];
        
        for (int i = 0; i < scores.length; i++){
            System.out.print((i + 1) + "번째 배열 입력: ");
            scores[i] = scanner.nextInt();
        }
        
        System.out.print("입력한 숫자들: ");
        for (int i = 0; i < scores.length; i++){
            System.out.print(scores[i] + " ");
        }

        scanner.close();
    }
    
}
