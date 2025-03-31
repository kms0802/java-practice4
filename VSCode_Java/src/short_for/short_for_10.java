package short_for;

public class short_for_10 {
    public static void main(String[]args){
        String[] words = {"apple", "hi", "computer"};

        int totalLength = 0;

        for (String word :words){
            totalLength = totalLength + word.length();
        }

        System.out.println("총 글자 수: " + totalLength);
    }
}
