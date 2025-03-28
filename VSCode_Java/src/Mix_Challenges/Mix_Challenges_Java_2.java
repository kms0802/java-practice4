package Mix_Challenges;

import java.util.Scanner;

public class Mix_Challenges_Java_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("나이를 입력하세요 : ");
        
        int age = scanner.nextInt();

        if (age >= 20)
        {
            System.out.println("더이상 어린이가 아닙니다.");
            scanner.close();
        }
        else if (age <=19 && age >= 14)
        {
            System.out.println("청소년 입니다.");
            scanner.close();
        }
        else if (age <= 13 && age >= 1)
        {
            System.out.println("어린이 입니다.");
            scanner.close();
        }
        else
        {
            System.out.println("잘못된 입력값입니다. ");
            scanner.close();
        }
        
    }
    
}
