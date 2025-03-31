package Method;

public class Method_22 {
    public static int countVowels(String text) {
        int count = 0;
        for (char ch : text.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[]args){
        System.out.println(countVowels("Hello World"));
    }
}
