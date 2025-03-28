package For_while_dowhile.for_while_dowhile_challenges;

import java.util.Scanner;

public class for_if_scanner_challenge_1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int i, j, k, height;
        
        System.out.print("몇줄까지 생성할것인지 정해주세요 : ");
        height = scanner.nextInt();

        for (i = 1; i <= height; i++){
            for (j = 1; j <= height - i; j++){
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        scanner.close();
    }
}
