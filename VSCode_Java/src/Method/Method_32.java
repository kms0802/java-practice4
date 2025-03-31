package Method;

public class Method_32 {
    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("\\s", "".toLowerCase());
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    public static void main(String[]args){
        System.out.println(isPalindrome("Race car"));
    }
}
