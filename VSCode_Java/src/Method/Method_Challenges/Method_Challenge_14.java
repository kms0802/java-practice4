package Method.Method_Challenges;

public class Method_Challenge_14 {
    public static String loginCheck(String Id, String Pw){
        if (Id.trim().equals("admin") && Pw.trim().equals("1234")) {
            return "로그인 성공";
        } else {
            return "로그인 실패";
        }

   
    }

    public static void main(String[]args) {
        System.out.print(loginCheck("admin","1234"));
    }
}
