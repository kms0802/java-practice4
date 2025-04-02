import java.util.Scanner;

public class practice_1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        
        System.out.print("num1입력 : ");
        num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("num2입력 : ");
        num2 = scanner.nextInt();

        System.out.print("num1 + num2 : ");
        System.out.print(num1 + num2);
        scanner.close();
    }
}
