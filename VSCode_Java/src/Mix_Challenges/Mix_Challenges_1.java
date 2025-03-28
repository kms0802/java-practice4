package Mix_Challenges;

import java.util.Scanner;

public class Mix_Challenges_1 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("점수를 입력하세요 : ");
        int score = scanner.nextInt();
          if (score <= 100 && score >= 90)
          {
            System.out.println("당신의 등급은 A입니다. " );
            scanner.close();
          }
          else if (score <= 89 && score >= 80)
          {
            System.out.println("당신의 등급은 B입니다. ");
            scanner.close();
          }
          else if (score <= 79 && score >= 70)
          {
            System.out.println("당신의 등급은 C입니다. ");
            scanner.close();
          }
          else if (score <= 69 && score >= 60)
          {
            System.out.println("당신의 등급은 D입니다. ");
            scanner.close();
          }
          else if (score <= 59 && score >= 0)
          {
            System.out.println("당신의 등급은 F입니다. ");
            scanner.close();
          }
          else
          {
            System.out.println("적당히가 없는 점수 ");
            scanner.close();
          }
    }
    
}
