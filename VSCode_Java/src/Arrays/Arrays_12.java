package Arrays;

public class Arrays_12 {
    public static void main(String[]args){
        int[] scores = {60, 70, 90, 85, 75};
        int sum = 0;

        for (int score : scores) {
            sum = sum + score;
        }

        double avg = (double)sum / scores.length;

        System.out.println("평균: " + avg);
        System.out.println("평균보다 큰 점수: ");

        for (int score : scores){
            if (score > avg) {
                System.out.println(score);
            }
        }
    }
    
}
