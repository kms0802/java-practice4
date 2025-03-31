package Method;

public class Method_20 {
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\s", "").toLowerCase();
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }

    public static void main(String[]args){
        System.out.println(isPalindrome("Racecar"));
        System.out.println(isPalindrome("Hello world"));
    }
}
