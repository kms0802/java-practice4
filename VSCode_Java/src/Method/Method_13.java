package Method;

public class Method_13 {
    public static boolean isAdmin(String name) {
        return name.equalsIgnoreCase("admin");
    }

    public static void main(String[]args){
        if (isAdmin("Admin")) {
            System.out.println("관리자입니다. ");
        }
    }
}
