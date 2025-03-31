package Method;

public class Method_41 {
    public static int countKeyword(String sentence, String keyword) {
        String[] words = sentence.toLowerCase().split(" ");
        int count = 0;
        for (String word : words) {
            if (word.equals(keyword.toLowerCase())) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[]args) {
        System.out.println(countKeyword("java is fun and java is powerful", "java"));
    }
}
