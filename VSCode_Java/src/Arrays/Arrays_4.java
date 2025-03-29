package Arrays;

public class Arrays_4 {
    public static void main(String[]args){
        int[] numbers = {45, 22, 89, 12, 67};
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("최솟값: " + min);
    }
}
