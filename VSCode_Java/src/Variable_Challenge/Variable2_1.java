package Variable_Challenge;

import java.util.Scanner;

public class Variable2_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("첫 번째 숫자 : ");
        int a = scanner.nextInt();

        System.out.println("두 번째 숫자 : ");
        int b = scanner.nextInt();

        System.out.println("바꾸기 전 -> a: " + a + " , b: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("바꾼 후 -> a: " + a + ", b: " + b);

        scanner.close();
    }
}
