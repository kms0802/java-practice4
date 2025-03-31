package Method;

public class Method_18 {
    public static double getAverage(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return (double) sum / arr.length;
    }

    public static void main(String[]args){
        int[] scores = {80, 90, 70};

        System.out.println("평균: " + getAverage(scores));
    }
}
