package Method;

public class Method_37 {
    public static String longestWord(String[] words) {
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[]args) {
        String[] words = {"apple", "banana", "kiwi"};
        System.out.println(longestWord(words));
    }
}
