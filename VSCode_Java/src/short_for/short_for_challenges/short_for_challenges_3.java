package short_for.short_for_challenges;

public class short_for_challenges_3 {
    public static void main(String[]args){
        int[] scores = {70, 80, 90};
        int sum = 0;

        for (int i = 0; i < scores.length; i++){
            sum = sum + scores[i];
        }

        System.out.println("합계" + sum);
    }
}
