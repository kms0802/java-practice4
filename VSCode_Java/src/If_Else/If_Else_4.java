package If_Else;

import java.util.Scanner;

public class If_Else_4 {
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        
        String inputId = "admin";
        String inputPw = "1234";

        if (inputId.equals("admin") && inputPw.equals("1234"))
        {
            System.out.println("로그인 성공");

        } else 
        {
            System.out.println("로그인 실패");
        }
    }
    
}
