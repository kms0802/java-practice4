package short_for;

public class short_for_9 {
    public static void main(String[]args){
        char[] letters = {'a', 'b', 'e', 'x', 'i'};

        for (char ch : letters) {
            if ("aeiou".indexOf(ch) != -1) {
                System.out.println("모음: " + ch);
            }
        }
    }
}
