package Method;

public class Method_38 {
    public static boolean isSameCleaned(String a, String b) {
        return a.trim().equalsIgnoreCase(b.trim());
    }

    public static void main(String[]args) {
        System.out.println(isSameCleaned(" admin ", "ADMIN"));
    }
}
