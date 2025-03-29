package Arrays;

public class Arrays_2 {
    public static void main(String[]args){
        int[] scores = {80, 90, 85, 95, 100};
        int sum = 0;

        for (int i = 0; i < scores.length; i++){
            sum = sum + scores[i];
        }

        double avg = (double)sum / scores.length;
        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
    }
    
}
