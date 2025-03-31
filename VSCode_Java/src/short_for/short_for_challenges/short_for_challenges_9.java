package short_for.short_for_challenges;

public class short_for_challenges_9 {
    public static void main(String[]args){
        String[] words = {"cat", "banana", "sun", "apple"};

        for (String word : words) {
            if (word.length() >= 4){
                System.out.println(word);
            }
        }
    }
}
