package Mix_Challenges;

import java.util.Scanner;

public class Mix_Challenges_Java_3 {
    
    public static void main(String[]args){
         Scanner scanner = new Scanner(System.in);

         System.out.println("아이디 : ");
         String Id = scanner.nextLine();
         

         System.out.println("비밀번호 : ");
         String Pw = scanner.nextLine();

         if (Id.equals("admin") && Pw.equals("1234"))
         {
            System.out.println("로그인이 성공하였습니다.");
         }
         else
         {
            
            System.out.println("로그인이 실패하였습니다.");
         }
         scanner.close();
        

    }
    
}
