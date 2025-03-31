package Method;

public class Method_42 {
    public static int countKeyword(String sentence, String keyword) {
        String[] words = sentence.toLowerCase().split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(keyword.toLowerCase())) count ++;
        }

        return count;
    }
}
