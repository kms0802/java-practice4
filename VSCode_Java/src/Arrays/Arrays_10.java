package Arrays;

import java.util.Scanner;

public class Arrays_10 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("정수 5개를 입력하세요. ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.print("입력한 숫자들: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
