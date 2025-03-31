package short_for;

public class short_for_6 {
    public static void main(String[]args){
        int[] scores = {90, 85, 70, 100};
        int sum = 0;

        for (int score : scores) {
            sum = sum + score;
        }

        System.out.println("총합 " + sum);
    }
}
