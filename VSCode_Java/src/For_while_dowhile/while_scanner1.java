package For_while_dowhile;

import java.util.Scanner;

public class while_scanner1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int secret = 7;
        int guess = 0;

        while (guess != secret){
            System.out.println("숫자를 맞혀보세요 (1~10): ");
            guess = scanner.nextInt();
        }

        System.out.println("정답입니다.");
        scanner.close();
    }
}
