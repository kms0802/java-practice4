package Method.Method_Challenges;

public class Method_Challenge_7 {
    public static void main(String[]args){
        int[] scores = {80, 90, 70, 60, 100};

        int total = getSum(scores);
        double average = getAverage(scores);

        System.out.println("합계 : " + total);
        System.out.println("평균 : " + average);
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i <arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static double getAverage(int[] arr){
        return (double)getSum(arr) / arr.length;
    }
}
