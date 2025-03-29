package Arrays.Arrays_Challenge;

public class Arrays_Challenge_5 {
    public static void main(String[]args){
        int[] scores = {30, 55, 70, 40, 90};

        for (int i = 0; i < scores.length; i++){
            if (scores[i] >= 50){
                System.out.println(scores[i]);
            }
        }
    }
}
