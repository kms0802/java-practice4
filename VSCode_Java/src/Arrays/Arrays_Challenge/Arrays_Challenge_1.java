package Arrays.Arrays_Challenge;

public class Arrays_Challenge_1 {
    public static void main(String[]args){
        int[] scores = {80, 95, 70, 100, 85};
        int sum = 0;
        for (int i = 0; i < scores.length; i++){
            sum = sum + scores[i];
        }

        double ave = (double)sum / scores.length;
        
        System.out.println("합: " + sum + "\n평균: " + ave);
    }
}
