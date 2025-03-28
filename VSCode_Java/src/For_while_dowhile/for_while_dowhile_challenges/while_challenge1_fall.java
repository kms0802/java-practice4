/*package For_while_dowhile.for_while_dowhile_challenges;

import java.util.Scanner;

public class while_challenge1_fall {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
       int num , sum;
        sum = 0;
        num = 0;
        while (num = 0){
            
            System.out.println("숫자 입력(0 입력시 종료) : ");
            num = scanner.nextInt();
            sum = sum + num;
        }
        System.out.println("총 합계 " + sum);
        System.out.println("프로그램 종료 ");
        scanner.close();
    }
} */


package For_while_dowhile.for_while_dowhile_challenges;

import java.util.Scanner;

public class while_challenge1_fall {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int num = -1;
        int sum = 0;

        while (num != 0){
            System.out.println("숫자 입력 (0 입력 시 종료) : ");
            num = scanner.nextInt();

            sum = sum + num;
        }

        System.out.println("총 합계 : " + sum);
        scanner.close();
        
    }
}