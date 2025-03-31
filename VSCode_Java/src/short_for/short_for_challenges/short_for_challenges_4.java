package short_for.short_for_challenges;

public class short_for_challenges_4 {
    public static void main(String[]args){
        char[] letters = {'a', 'b', 'c', 'e'};

        for (int i = 0; i < letters.length; i++){
            if ("aeiou".indexOf(letters[i]) != -1){
                System.out.println("모음: " + letters[i]);
            }
        }
    }
}
