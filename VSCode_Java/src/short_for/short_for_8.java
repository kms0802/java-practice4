package short_for;

public class short_for_8 {
    public static void main(String[]args){
        String[] words = {"hi", "hello", "sun", "a", "banana"};

        for (String word : words) {
            if (word.length() >= 3) {
                System.out.println("길이 3 이상: " + word); 
            }
        } 
        
    }
}
