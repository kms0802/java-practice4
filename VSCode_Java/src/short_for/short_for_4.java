package short_for;

public class short_for_4 {
    public static void main(String[]args){
        String[] words = {"apple", "banana", "hi"};

        for (String word : words) {
            System.out.println(word + "의 길이" + word.length());
        }
    }
}
