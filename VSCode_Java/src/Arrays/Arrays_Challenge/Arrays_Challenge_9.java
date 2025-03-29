package Arrays.Arrays_Challenge;

public class Arrays_Challenge_9 {
    public static void main(String[]args){
        int[] numbers = {12, 35, 40, 27, 50, 61};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                System.out.print(numbers[i] + " ");
                sum = sum + numbers[i];
            }
        }
        double ave = (double) sum / numbers.length;
        System.out.println("");
        System.out.println(sum);
        System.out.println(ave);
    }
    
}
