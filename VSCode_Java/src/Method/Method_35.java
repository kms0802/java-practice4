package Method;

public class Method_35 {
    public static void checkAdmin(String name) {
        if (name.equalsIgnoreCase("admin")) {
            System.out.println("관리자 계정입니다. ");
        } else {
            System.out.println("일반 사용자입니다. ");
        }
    }

    public static void main(String[]args){
        checkAdmin("Admif");
    }
}
