package Method;

public class Method_31 {
    public static double getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return (double) sum / arr.length;
    }

    public static void main(String[]args){
        int[] scores = {90, 80, 70};
        System.out.println(getAverage(scores));
    }
}
