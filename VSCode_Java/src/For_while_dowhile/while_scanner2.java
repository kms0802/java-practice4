package For_while_dowhile;

import java.util.Scanner;

public class while_scanner2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇 번 반복할까요? ");
        int count = scanner.nextInt();
        int i = 1;

        while (i <= count){
            System.out.println(i + "번째 반복입니다. ");
            i++;
        }
        System.out.println("프록램을 종료합니다.");
        scanner.close();
    }
    
}
