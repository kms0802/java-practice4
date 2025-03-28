package Mix_Challenges;

import java.util.Scanner;

public class Mix_Challenges_Java_4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("아이디와 비밀번호를 입력하세요.");
        
        System.out.println("아이디 : ");
        String id = scanner.nextLine();

        System.out.println("비밀번호 : ");
        String pw = scanner.nextLine();

        if (id.equals("admin") && pw.equals("1234"))
        {
            System.out.println("성공적으로 로그인을 하였습니다. " );
        }
        else
        {
            if (!id.equals("admin") && !pw.equals("1234"))
            {
                System.out.println("둘다 틀렸습니다.");
            }
            else if(!pw.equals("1234"))
            {
                System.out.println("비밀번호가 틀렸습니다.");
            }
            else if(!id.equals("admin"))
            {
                System.out.println("아이디가 틀렸습니다. ");

            }
        }
         scanner.close();
    }
}
