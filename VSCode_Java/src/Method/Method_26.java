package Method;

public class Method_26 {
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[]args) {
        System.out.println(isEmpty("  "));
    }
}
